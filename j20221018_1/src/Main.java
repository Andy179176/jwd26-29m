import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static final String FILE_NAME = "1.txt";

    public static void main(String[] args) {
        System.out.println(read());
    }


    public static Map<String, Integer> read(){


        try(BufferedReader reader= new BufferedReader(new FileReader(FILE_NAME))) {
            return reader.lines()
                    .map(s -> s.split(":"))
                    .filter(arr -> arr.length == 2)
                    .collect(Collectors.toMap(
                            arr -> arr[0],
                            arr -> Integer.parseInt(arr[1]),
                            (i1, i2) -> i1 + i2,
                            TreeMap::new
                    ));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
