import java.io.*;
import java.net.URL;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            //demo1IOByteByByte();
            //demo2IOArray();
            demo3();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void demo1IOByteByByte() throws IOException {
        InputStream fis = new FileInputStream("file.txt");
        //InputStream fis = new ByteArrayInputStream(new byte[]{97,98,99,100});
        //InputStream fis = new URL("https://www.google.com/").openStream();
        //OutputStream fos = new FileOutputStream("google.html", true);
        OutputStream fos = new FileOutputStream("file1.txt", true);

        int data;
        while (  ( data= fis.read() )!=-1 ){
            //System.out.printf("%d (%x) %c%n", data,data,data);
            System.out.print((char)data);
            fos.write(data);
        }
        //System.out.println(data);
        // 0 .. 255    //00..FF
        // -128 ... 127


        fos.flush();
        fos.close();
        fis.close();

    }

    public static void demo2IOArray() throws IOException {
        InputStream fis = new FileInputStream("file.txt");
//        OutputStream fos = new FileOutputStream("file1.txt", true)

        byte[] data= new byte[1024*1024];
        int count;
        while (  ( count= fis.read(data) )!=-1 ){
           System.err.println(count);
           if(count<data.length){
               System.out.println(new String(Arrays.copyOf(data,count)));
           } else {
               System.out.print(new String(data));
           }
  //          fos.write(data);
        }


//        fos.flush();
//        fos.close();
        fis.close();

    }

    public static void demo3() throws IOException {
        InputStream fis = new FileInputStream("file.txt");
        byte[] bytes = fis.readAllBytes();
        System.out.println(new String(bytes));
        fis.close();
    }


}

