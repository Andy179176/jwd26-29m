import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main3 {
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        Thread[] threads={
                new Thread(new Task01(lock),"Jack"),
                new Thread(new Task01(lock),"Nick"),
                new Thread(new Task01(lock),"Ann"),
        };
        for (Thread t:threads){
            t.start();
        }

        for (Thread t:threads){
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("----------------- FINISH ---------------------- ");


    }

}

class Task01 implements Runnable{
        private Lock lock;

    public Task01(Lock lock) {
        this.lock = lock;
    }

    @Override
    public  void run() {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s: Try to do Task01 %n", threadName);
        if(lock.tryLock()) {
                try {
                    System.out.printf("%s: start Task01 %n", threadName);
                    for (int i = 0; i <= 100; i++) {
                        if (i % 10 == 0) {
                            System.out.printf("%s: %d%% done %n", threadName, i);
                            hardWork();
                        }
                    }
                    System.out.printf("%s: finish Task01 %n", threadName);
                } finally {
                    lock.unlock();
                }
            } else {
            System.out.printf("%s: Task01  is blocked %n", threadName);
            }

    }

    public static void hardWork(){
        int limit = 3000;
        double res=1;
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                res=1.0*i/j+res;
            }

        }
    }

}
