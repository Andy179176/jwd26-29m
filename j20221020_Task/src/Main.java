/*
Дан файл с именами вида:

Сергей;
Олег;
Иван;
....

Для каждой строки из файла запросить у пользователя возраст и записать в файл

Сергей - 27;
Олег - 33;
Иван - 45;
....

 */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static final String FILE_NAME = "1.txt";

    public static void main(String[] args) {
        fileHandler();
    }
    public static void fileHandler(){
        try(BufferedReader r=new BufferedReader(new FileReader(FILE_NAME));
            BufferedWriter w=new BufferedWriter(new FileWriter("tmp.tmp"))){
            Scanner scanner = new Scanner(System.in);

            r.lines()
                    .filter(s->!s.isBlank())
                    .map(s->s.endsWith(";")?s.substring(0,s.length()-1):s)
                    .forEach( name->{
                        writeLine(w,name,getAge(scanner,name));
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File file=new File(FILE_NAME);
        File tmpFile=new File("tmp.tmp");
        if(file.delete()){
            tmpFile.renameTo(file);
        }
        System.out.println("------ done -------");
    }

    private static void writeLine(BufferedWriter w, String name, int age) {
        try {
            w.write(name+"-"+age+";");
            w.newLine();
            w.flush();
        } catch (IOException e) {
            throw new RuntimeException("Error to write "+ name);
        }
    }

    private static int getAge(Scanner scanner, String name) {
        System.out.printf("Имя:%s введите возраст: %n",name);
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        return 0;
    }
}