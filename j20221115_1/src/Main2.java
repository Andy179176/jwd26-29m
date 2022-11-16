import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main2 {
    private static final int TASK_LIMIT = 10;

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
        System.out.println("main start");
        for (int i = 0; i < TASK_LIMIT ; i++) {
            executor.schedule(new Task2(i), 5, TimeUnit.SECONDS);
        }
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main finish");
    }
}
class Task2 implements Runnable{
    private  final int taskNum;

    public Task2(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public void run() {


        System.out.println(taskNum+":"+Thread.currentThread().getName() + ": start");
        for (int i = 0; i < 100; i++) {
            if(i%10==0){
                System.out.println(taskNum+":"+Thread.currentThread().getName() + ":"+ i + "% done");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println(taskNum+":"+Thread.currentThread().getName() + ": finish");

    }
}

