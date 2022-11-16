public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        PingPong pingPong = new PingPong();
        Thread thread1 = new Thread(pingPong::printPing);
        Thread thread2 = new Thread(pingPong::printPong);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("----------- end -----------------");

        thread1 = new Thread(pingPong::printPing);
        thread2 = new Thread(pingPong::printPong);

        thread1.start();
        thread2.start();
    }


}

class PingPong {
    private static String str = "pong";
    private final Object lock = new Object();
    private final int LIMIT = 20;

    void printPong() {
        for (int i = 0; i < LIMIT; ) {

            synchronized (lock) {
                if (str.equals("ping")) {
                    str = "pong";
                    i++;
                    System.out.println(i+" "+str);
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    void printPing() {
        for (int i = 0; i < LIMIT; ) {

            synchronized (lock) {
                if (str.equals("pong")) {
                    str = "ping";
                    i++;
                    System.out.println(i+ " "+str);
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}