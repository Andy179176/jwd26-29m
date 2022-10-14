import java.io.*;

public class Main {
    public static void main(String[] args) {
        byte[][] data = read();
        writeFiles(data);
    }
// -128 .. 127  (10110001)
//    0 .. 255
// (1 1111111)  file: 255   java: -1
// (1 1111110)  file: 254   java: -2
// (1 1111101)  file: 253   java: -3

// (0 1111111)  file: 127   java: 127
// (0 1111110)  file: 126   java: 126


    public static void writeFiles(byte[][] data){
        for (int i = 0; i < data.length; i++) {
            String type = getType(data[i]);
            String fileName="";
            if (!type.isEmpty()){
                fileName = type.equals("class")?"Main.class":"pic."+type;
            } else {
                throw new RuntimeException("Unknown data type: part "+ (i+1));
            }

            try (OutputStream fo= new FileOutputStream(fileName)){

                fo.write(data[i]);
                fo.flush();

            } catch (IOException e){
                System.err.println("Error writing "+fileName);
            }


        }
    }

    public static String getType(byte[] arr){
        String res="";
        for (FileSignature fs : FileSignature.values()){
            if(fs.check(arr)){
                return fs.getType();
            }
        }
        return res;

    }


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