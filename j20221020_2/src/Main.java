import java.io.*;

public class Main {
    public static void main(String[] args) {

        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("1.txt")))){
            out.printf("Hello from Java");
            System.setOut(new PrintStream(new FileOutputStream("2.txt")));
            System.out.println("Hello from Java");
            System.out.println();




        } catch (IOException e) {
            throw new RuntimeException(e);
        }





        //System.out.println("Hello world!");
    }
}