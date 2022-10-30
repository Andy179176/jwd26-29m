import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        Demo1 d2=new Demo1();
        Demo1 d3=new Demo1();
        Demo1 d4=new Demo1();

        Thread[] threads = {d1,d2,d3,d4};
        for (int i = 0; i<threads.length; i++){
            threads[i].setName("Thread " + i);
        }

        for (Thread t:threads){
            t.start();
        }

        Thread thread = new Thread(new Demo2());

    }
}