import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FileWatcher {
    public static final String observedDirStr="D:/observed";
    public static final String jpgDirStr="D:/observed/jpg";
    public static final String pngDirStr="D:/observed/png";
    public static File observedDir= new File(observedDirStr);
    public static File jpgDir= new File(jpgDirStr);
    public static File pngDir= new File(pngDirStr);

    public FilenameFilter filter = ((dir, name) -> dir.equals(observedDir) &&
            (name.endsWith(".jpg")|| name.endsWith(".png")));

    private final ConcurrentHashMap<File,Boolean> map = new ConcurrentHashMap<>();
    private  final ConcurrentLinkedQueue<File> queue= new ConcurrentLinkedQueue<>();
    private Lock lock = new ReentrantLock();

    public void dir(){
        File[] files = observedDir.listFiles(filter);
        for (File file:files){
            if(file.canWrite()) {
                lock.lock();
                try {
                    if (!map.containsKey(file)) {
                        map.putIfAbsent(file, false);
                        queue.offer(file);
                    }
                } finally {
                    lock.unlock();
                }
            }

        }

    }

    public void move(){
        while (!Thread.currentThread().isInterrupted()) {
            if (queue.size() > 0) {
                File file = queue.poll();
                File dir = null;
                String name = file.getName();
                if (name.endsWith(".jpg")) {
                    dir = jpgDir;
                }
                if (name.endsWith(".png")) {
                    dir = pngDir;
                }
                if (dir != null) {
                    File newFile = new File(dir, name);
                    file.renameTo(newFile);
                    map.put(file, true);
                }
            }
        }
    }


    public void  print(){
        System.out.println(map);
        System.out.println(queue);
    }

}
