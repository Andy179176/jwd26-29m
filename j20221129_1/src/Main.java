import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {

    public static void main(String[] args) {

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        final int limit = -1;
        int n = 20;
        do {
            produce(queue);
            n++;
        }
        while (n <= limit);
    }

    static void produce(ArrayBlockingQueue<String> queue) {
        Thread producer = new Thread(() -> {
            String[] words = new String[]{"Ping", "Pong"};
            for (int i = 0; i < words.length && !Thread.interrupted(); ) {
                try {
                    Thread.sleep(100);
                    queue.put(words[i]);
                    //System.out.println(words[i]);
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {

            while (!Thread.interrupted()) {
                try {
                    Thread.sleep(100);
                    System.out.println(queue.take());
                    //System.out.println(sb);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        consumer.start();
    }
}