/*
Реализовать многопоточное заполнение массива на N элементов (например, на 1000000 элементов)
случайными числами.  При том каждый поток заполняет свой участок массива (например,
если два потока то один заполняет с 0 по 499999 элементы, а второй оставшиеся). Заполнить
массив в 1 поток, в 3 потока, в 5 потоков. Засечь время заполнения.Сравнить результаты и
выяснить самый эффективный способ.

 */

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Main {



    public static void main(String[] args) {
        double[] array = new double[100_000000];
        //double[] array = new double[8];
/*
        Thread[] threads2 = {
                new Thread(new FillArray(array,0,50_000000)),
                new Thread(new FillArray(array,50_000000,100_000000))
        };



        Thread[] threads5 = {
                new Thread(new FillArray(array,0,20_000000)),
                new Thread(new FillArray(array,20_000000,40_000000)),
                new Thread(new FillArray(array,40_000000,60_000000)),
                new Thread(new FillArray(array,60_000000,80_000000)),
                new Thread(new FillArray(array,80_000000,100_000000)),
        };

        Thread[] threads1 = {
                new Thread(new FillArray(array,0,100_000000)),
        };

        Thread[] threads10 = {
                new Thread(new FillArray(array,0,10_000000)),
                new Thread(new FillArray(array,10_000000,20_000000)),
                new Thread(new FillArray(array,20_000000,30_000000)),
                new Thread(new FillArray(array,30_000000,40_000000)),
                new Thread(new FillArray(array,40_000000,50_000000)),
                new Thread(new FillArray(array,50_000000,60_000000)),
                new Thread(new FillArray(array,60_000000,70_000000)),
                new Thread(new FillArray(array,70_000000,80_000000)),
                new Thread(new FillArray(array,80_000000,90_000000)),
                new Thread(new FillArray(array,90_000000,100_000000)),

        };

 */


        /*
        long start= System.currentTimeMillis();
        fill(threads2);
        long end= System.currentTimeMillis();
        double time = (end-start)/1000.0;
        System.out.println(time);
        */

        System.out.println("--------------- 10 ------------------");
        fill(createThreads(10,array));
        System.out.println("--------------- 5 ------------------");
        fill(createThreads(5,array));
        System.out.println("--------------- 2 ------------------");
        fill(createThreads(2,array));
        System.out.println("--------------- 1 ------------------");
        fill(createThreads(1,array));

    }




    public static Thread[] createThreads(int numberOfThreads, double[] arr){
        numberOfThreads=Math.min(numberOfThreads,arr.length);
        Thread[] threads= new Thread[numberOfThreads];
        int part = arr.length/numberOfThreads;
        int part0= arr.length%numberOfThreads;
        int start=0;
        for (int i = 0; i < numberOfThreads; i++) {
            int end=start+part+((part0-->0)?1:0);
            threads[i] = new Thread(new FillArray(arr,start,end));
            start=end;
        }
        return  threads;
    }







    public static void fill(Thread[] threads){
        Instant start =Instant.now();

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
        Instant end = Instant.now();
        System.out.println(ChronoUnit.MILLIS.between(start,end));

    }

}

class FillArray implements Runnable{
    private double[] arr;
    private int startIndex;
    private  int endIndex;
    private Random r= new Random(System.currentTimeMillis());


    public FillArray(double[] arr, int startIndex, int endIndex) {
        this.arr = arr;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex ; i++) {
            arr[i]= r.nextDouble()/1000;
            arr[i]= arr[i]*1000;
        }
    }
}


