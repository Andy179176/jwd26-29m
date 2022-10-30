import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) {
        Person p;
        try(ObjectInputStream in= new ObjectInputStream(new FileInputStream("1.dat"))){
            p=(Person)in.readObject();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(p);
    }


}
