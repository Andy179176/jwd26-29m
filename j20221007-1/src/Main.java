import java.io.*;

public class Main {
    public static void main(String[] args) {
        copy3();
    }

    public static  void copy(){
        //InputStream is = null;
        //OutputStream os = null;

        try ( InputStream is = new FileInputStream("D:\\123\\1.mp4");
              OutputStream os = new FileOutputStream("D:\\123\\1copy.mp4", true);
            ){
            int count=0;
            int data;
            while ((data = is.read()) != -1) {
                count++;
                if(count%1000000==0) System.out.println(count);
                os.write(data);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static  void copy2(){


        try ( InputStream is = new FileInputStream("D:\\123\\1.mp4");
              OutputStream os = new FileOutputStream("D:\\123\\1copy.mp4", true);
        ){
            int size=1024*1024;
            int count=0;
            byte[] data= new byte[size];
            while ((count = is.read(data)) != -1) {
                System.out.println(count);
                if (count<size){
                    os.write(data,0,count);
                } else {
                    os.write(data);
                }
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static  void copy3(){
        //InputStream is = null;
        //OutputStream os = null;

        try ( InputStream is = new BufferedInputStream(new FileInputStream("D:\\123\\1.mp4"));
              OutputStream os = new BufferedOutputStream(new FileOutputStream("D:\\123\\1copy.mp4", false));
        ){
            int count=0;
            int data;
            while ((data = is.read()) != -1) {
                count++;
                if(count%10000000==0) System.out.println(count);
                os.write(data);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}