import java.io.*;
import java.nio.charset.Charset;
import java.util.Map;

import static java.nio.charset.Charset.availableCharsets;

public class Main {
    public static void main(String[] args) {
/*
     for(Map.Entry chr:       Charset.availableCharsets().entrySet()){
         System.out.println(chr);
     }
*/
        Charset charset = Charset.forName("KOI8-R");


        try(BufferedReader reader= new BufferedReader(new FileReader("2.t", charset));){
            int data;
            while ((data=reader.read())!=-1){
                System.out.print((char)data);
                
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("--------------------------------");

        try(InputStream reader= new FileInputStream("1.txt");){
            int data;
            while ((data=reader.read())!=-1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}