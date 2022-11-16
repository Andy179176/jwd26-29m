import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Task4 task=new Task4();
        executor.submit(task);
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(task.getSum());
    }
}
class Task4 implements Runnable{

    private static final int LIMIT =1_000_000 ;
    private long sum=0;

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        long sum=0;
        for (int i = 0; i < LIMIT ; i++) {
            sum+=i;

        }
        this.sum=sum;
    }
}