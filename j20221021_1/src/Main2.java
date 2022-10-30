import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        File file = new File("1.dat");

        if(file.exists() && file.canRead()) {
            try (DataInputStream is = new DataInputStream(new FileInputStream(file))) {
                System.out.println(is.readInt());
                System.out.println(is.readBoolean());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Файл не доступен. Берем значения по-умолчанию");
        }
    }
}