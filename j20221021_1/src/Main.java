import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("1.dat");
        if(!file.exists() || !file.canRead()){
            //return
        }
        try(DataOutputStream os= new DataOutputStream(new FileOutputStream(file))){

            os.writeInt(17);
            os.writeBoolean(true);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world!");
    }

}