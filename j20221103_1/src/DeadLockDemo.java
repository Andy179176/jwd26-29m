public class DeadLockDemo {
    private static final Object lock1=new Object();
    private static final Object lock2=new Object();


    private static Runnable r1= new Runnable() {
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println(Thread.currentThread().getId()+ ": I get Lock 1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                System.out.println(Thread.currentThread().getId()+ ": I try to get Lock 2");
                synchronized (lock2){
                    System.out.println(Thread.currentThread().getId()+ ": I get Lock 2");
                }

            }
        }
    };

    private static Runnable r2= new Runnable() {
        @Override
        public void run() {

            synchronized (lock2){
                System.out.println(Thread.currentThread().getId()+ ": I get Lock 2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                System.out.println(Thread.currentThread().getId()+ ": I try to get Lock 1");
                synchronized (lock1){
                    System.out.println(Thread.currentThread().getId()+ ": I get Lock 1");
                }

            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        System.out.println("----------- start --------");
        Thread thread1=new Thread(r1);
        Thread thread2=new Thread(r2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("----------- finish --------");

    }

}
