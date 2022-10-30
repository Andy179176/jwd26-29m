import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        Person p;
        File file = new File("D:\\jwd28m\\j20221021_2\\4.dat");
        try(ObjectInputStream in= new ObjectInputStream(new FileInputStream(file))){
            p=(Person)in.readObject();

        } catch (IOException|ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(p);
    }


}
