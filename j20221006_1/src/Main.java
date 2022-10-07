import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            demo1IOByteByByte();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void demo1IOByteByByte() throws IOException {
        InputStream fis = new FileInputStream("file.txt");
        //InputStream fis = new ByteArrayInputStream(new byte[]{97,98,99,100});
        //InputStream fis = new URL("https://www.google.com/").openStream();
        //OutputStream fos = new FileOutputStream("google.html", true);

        int data;
        while (  ( data= fis.read() )!=-1 ){
            //System.out.printf("%d (%x) %c%n", data,data,data);
            System.out.print((char)data);
            //fos.write(data);
        }
        System.out.println(data);
        // 0 .. 255    //00..FF
        // -128 ... 127

        //fos.close();
        fis.close();
    }




}

