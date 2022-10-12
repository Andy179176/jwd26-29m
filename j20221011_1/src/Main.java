import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        byte[][] data = read();

        for (int i = 0; i < 30 ; i++) {
            System.out.print(data[0][i]+ " ");
        }
        System.out.println();
    }
// -128 .. 127  (10110001)
//    0 .. 255
// (1 1111111)  file: 255   java: -1
// (1 1111110)  file: 254   java: -2
// (1 1111101)  file: 253   java: -3

// (0 1111111)  file: 127   java: 127
// (0 1111110)  file: 126   java: 126



    public static byte[][] read()  {
        byte[][] data = {new byte[601], new byte[57053], new byte[22494]};
        try(InputStream is = new FileInputStream("file.dat")){

            for (int i = 0; i <data.length ; i++) {
                if(is.read(data[i])!=data[i].length){
                  throw new IOException("file.dat error: read part #"+i);
                };
            }
            if(is.read()!=-1){
                throw new IOException("file.dat error: invalid format");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return data;
    }



}