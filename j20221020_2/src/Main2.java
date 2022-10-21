import java.io.*;
import java.util.Scanner;

public class Main2  {
    public static void main(String[] args) throws IOException {

        PrintStream outputStream = new PrintStream(new BufferedOutputStream(
                                      new FileOutputStream("3.txt")
        ));

        PrintStream con = System.out;
        con.println("Hello");
        //System.setOut(outputStream);

        System.out.println("asdfghjkl;");

        InputStream in = System.in;

        outputStream.close();
        Scanner scanner = new Scanner(new FileInputStream("2.txt"));
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println("1 "+s);
        }



    }
}
