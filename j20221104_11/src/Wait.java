public class Wait {
    private static Object lock = new Object();
    private static String str="Ping";

    public static void main(String[] args) {
                   new Thread(Wait::printPing).start();
                   new Thread(Wait::printPong).start();
                   new Thread(Wait::printPong).start();
                   new Thread(Wait::printPong).start();

    }

    public  static void  printPing(){
        synchronized (lock){
            for (int i = 0; i < 20; i++) {

                while(!str.equals("Ping")){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                System.out.print("Ping");
                str= "Pong";
                lock.notifyAll();

            }
       }
    }

    public  static void  printPong(){
        synchronized (lock){
            for (int i = 0; i < 20; i++) {

                while(!str.equals("Pong")){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                System.out.println(" Pong");
                str= "Ping";
                lock.notify();

            }



        }
    }


}
