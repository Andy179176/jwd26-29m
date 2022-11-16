import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        //Properties properties = System.getProperties();
        //properties.forEach((k,v)-> System.out.println(k +":" +v));
        //System.out.println(System.getenv());
        //System.out.println(properties);
        ExecutorService service = Executors.newCachedThreadPool();


        for (int i=0; i<10; i++){
            final int iii=i;
            Runnable r= new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getId()+ ": start   " + " Задача "+iii );
                    for (int j = 0; j < 3; j++) {
                        System.out.println("Задача "+iii+":"+j + "(Thread "+Thread.currentThread().getId()+")");
                        try {
                            Thread.sleep((int)(Math.random()*2000));
                            //Thread.currentThread().sleep(2000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println(Thread.currentThread().getId()+ ": finish " +"Задача "+iii);
                }
            };

            service.execute(r);

    }

        service.execute(()-> System.out.println("Hi"));
        service.shutdown();

    }


}
