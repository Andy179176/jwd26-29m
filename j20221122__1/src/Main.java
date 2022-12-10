import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock= new ReentrantLock();
        Runnable[] runnables= {
               new ThreadTask("Jack",lock),
               new ThreadTask("John",lock),
               new ThreadTask("Nick",lock),
               new ThreadTask("Stan",lock),
        };
        ExecutorService executor = Executors.newFixedThreadPool(10);
        try {
            for (Runnable r : runnables) {
                executor.execute(r);
            }
        } finally {
            executor.shutdown();
            try {
                if(!executor.awaitTermination(40, TimeUnit.SECONDS)){
                    System.exit(-1);
                    return;
                };
            } catch (InterruptedException e) {}

        }




    }
}

class ThreadTask implements Runnable{
    private String name;
    private Lock lock;//   ERROR ! ->  = new ReentrantLock();

    public ThreadTask(String name, Lock lock) {
        this.name = name;
        this.lock=lock;
    }

    @Override
    public void run() {
        Runnable[] tasks ={this::method1,this::task2,this::task3};
        int currentTask =0;
        boolean exclusiveServiceDone=false;
        while (!exclusiveServiceDone && currentTask<tasks.length){
            if(lock.tryLock()){
                try{
                    exclusiveService();
                    exclusiveServiceDone=true;
                } finally {
                  lock.unlock();
                }
            } else {
                tasks[currentTask++].run();
                if(currentTask==tasks.length){
                    currentTask=0;
                }
            }
        }
    }

    private void exclusiveService(){
        System.out.printf("(lock = %s)  %s: ExclusiveService start.... %n",lock,name);
        for (int i = 0; i <= 100; i++) {
            if(i%10==0){
                System.out.printf("  %s: ExclusiveService %d%% complete %n",name,i);
                hardWork();
            }
        }
        System.out.printf("%s: ExclusiveService finish",name);

    }


    private void method1(){
        System.out.printf("%s: Task1 start.... %n",name);
        hardWork();
        System.out.printf("  %s: Task1 in process... %n",name);
        hardWork();
        System.out.printf("%s: Task1 finish.... %n",name);
        }

    private void task2(){
        System.out.printf("%s: Task2 start.... %n",name);
        hardWork();
        System.out.printf("  %s: Task2 in process... %n",name);
        hardWork();
        System.out.printf("%s: Task2 finish.... %n",name);
    }

    private void task3(){
        System.out.printf("%s: Task3 start.... %n",name);
        hardWork();
        System.out.printf("  %s: Task3 in process... %n",name);
        hardWork();
        System.out.printf("%s: Task3 finish.... %n",name);
    }



    private void hardWork() {
        int limit=10000;
        double res=1.0;
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j <limit ; j++) {
                res=res/(i+j);
            }
            res=1;
        }
    }

}