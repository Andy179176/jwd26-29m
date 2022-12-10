import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc= new Scanner(System.in);
        FileWatcher fw= new FileWatcher();
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        service.scheduleAtFixedRate(fw::dir,5,10, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(fw::print,7,7, TimeUnit.SECONDS);
        ExecutorService move=Executors.newSingleThreadExecutor();
        move.submit(fw::move);

        String exit="";
        while (!exit.equals("q")){
            exit= sc.nextLine();
        }
        service.shutdown();
        move.shutdown();
        if(!move.awaitTermination(10,TimeUnit.SECONDS)){
            move.shutdownNow();
        }
    }
}