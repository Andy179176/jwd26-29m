import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        File file = new File("D:/123");
        String[] list = file.list();

        System.out.println(file.isDirectory());
        System.out.println(Arrays.toString(list));

        /*
        try {
            FileReader fr= new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        */
    }
}