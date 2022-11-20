import java.util.Random;
import java.util.concurrent.*;

public class Main {
    private static final int MAX_LIMIT = 5000;
    private static final int MIN_LIMIT = 2000;
    Random rnd = new Random(System.nanoTime());


    public static void main(String[] args) {
        Callable<String> getMsg = () -> new Main().getMsg();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> resultFuture = executor.submit(getMsg);
        System.out.println(resultFuture);

        String resultStr = "";
        try {
            resultStr = resultFuture.get(4, TimeUnit.SECONDS);
            System.out.println(resultFuture);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new NotResponseException("Нет ответа с Марса, что то пошло не так!");
        } catch (TimeoutException e) {
            throw new NotResponseException("Нет ответа с Марса");
        } finally {
            executor.shutdown();
        }


        System.out.println(resultStr);
        System.out.println("Finish");


    }

    public String getMsg() {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s: send request to Mars  %n", threadName);
        //long res = Thread.currentThread().getId()/0;   //ExecutionException
        try {
            Thread.sleep(rnd.nextInt(MAX_LIMIT-MIN_LIMIT+1)+MIN_LIMIT);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return String.format("%s: hello from Mars  %n", threadName);
    }

}