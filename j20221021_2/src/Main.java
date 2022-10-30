import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Person p1= new Person("Jack", 28);
        Person p2= new Person("Jack1", 28, new BankAccount("123456") );

        File file = new File("4.dat");
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))){
            out.writeObject(p2);
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("----------- done ------------");

    }
}