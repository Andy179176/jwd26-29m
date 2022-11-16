import java.util.concurrent.*;

public class Main6 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Task6 task=new Task6();
        Future<Long> result = executor.submit(task);

        try {

            System.out.println(result.get());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        }
        finally {
            executor.shutdown();
        }
    }
}

class Task6 implements Callable<Long> {

    private static final int LIMIT =1_000_001 ;

    @Override
    public Long call() throws Exception {
        if(LIMIT>1_000_000){
            throw new Exception("Слишком много!!!!");
        }
        long res=0;
        for (int i = 0; i < LIMIT; i++) {
            res+=i;
        }
        return res;
    }
}
