import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main3 {
    private static final int TASK_LIMIT = 1;

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        System.out.println("main start");
        for (int i = 0; i < TASK_LIMIT ; i++) {
            executor.scheduleWithFixedDelay(new Task3(i), 5,2, TimeUnit.SECONDS);
        }
        try {
            executor.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
        System.out.println("main finish");
    }
}

class Task3 implements Runnable {
    private static  int taskNum =0;

    public Task3(int taskNum) {
        this.taskNum = taskNum++;
    }

    @Override
    public void run() {

        System.out.println(taskNum + ":" + Thread.currentThread().getName() + ": start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(taskNum+":"+Thread.currentThread().getName()+": finish");
    }
}



