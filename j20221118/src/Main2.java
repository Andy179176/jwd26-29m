import java.util.Random;
import java.util.concurrent.*;

public class Main2 {
    private static final int MAX_LIMIT = 5000;
    private static final int MIN_LIMIT = 2000;
    //ThreadLocalRandom rnd = new ThreadL(System.nanoTime());


    public static void main(String[] args) {
        Callable<String> marsReq = () -> new Main2().getMsgFromMars();
        Callable<String> saturnReq = () -> new Main2().getMsgFromSaturn();

        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> res1 = executor.submit(marsReq);
        Future<String> res2 = executor.submit(saturnReq);

        String msg="";
        try {
            while (!res1.isDone() && !res2.isDone()) {
                Thread.sleep(200);
                System.out.print(".");
            }
            System.out.println(res1);
            System.out.println(res2);
            System.out.println();

            if (res1.isDone()) {
                msg = res1.get();
            } else {
                msg = res2.get();
            }
        } catch (ExecutionException e) {
            throw new NotResponseException("Нет ответа");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executor.shutdown();
        }
        System.out.println(msg);
        System.out.println("-------------- FINISH ----------------");



    }

    public String getMsgFromMars() {
        String threadName = Thread.currentThread().getName();
        int time = ThreadLocalRandom.current().nextInt(MAX_LIMIT-MIN_LIMIT+1)+MIN_LIMIT;
        System.out.printf("%s: send request to Mars (%d) %n", threadName,time);
        //long res = Thread.currentThread().getId()/0;
        try {
         Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return String.format("%s: hello from Mars  %n", threadName);
    }



    public String getMsgFromSaturn() {
        String threadName = Thread.currentThread().getName();
        int time = ThreadLocalRandom.current().nextInt(MAX_LIMIT-MIN_LIMIT+1)+MIN_LIMIT;
        System.out.printf("%s: send request to Saturn (%d) %n", threadName,time);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return String.format("%s: hello from Saturn  %n", threadName);
    }

}