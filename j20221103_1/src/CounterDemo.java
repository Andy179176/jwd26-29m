public class CounterDemo {
    private Object lock = new Object();

    private final int LIMIT = 10_000;
    private int counter = 0;

    public static void main(String[] args) {

        CounterDemo obj = new CounterDemo();
        obj.createThreads(5);
        System.out.println(obj);


    }

    public void createThreads(int threadCount){
        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i<threads.length; i++){
            threads[i]= new Thread(this::add);
        }
        for (Thread t: threads){
            t.start();
        }
        for (Thread t: threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public  void add(){


        for (int i = 0; i < LIMIT ; i++) {

            synchronized (lock){
                counter++;
            }


            /*addCounter();

            if(counter%5000==0){
                System.out.println(Thread.currentThread().getName());
            }

             */

            // read the value of counter
            // add 1 to counter value
            // write new counter value
        }
    }
    private synchronized void addCounter(){
        counter++;
    }

    @Override
    public String toString() {
        return "counter=" + counter;
    }
}