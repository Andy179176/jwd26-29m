import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        BuilderExample test = new BuilderExample.Builder(10,20)
                .param3(30)
                .param5(50)
                .build();

        BuilderExample test1 = new BuilderExample.Builder(100,200)
                .param5(500)
                .build();





        System.out.println(test);
        System.out.println(test1);
/*
                BuilderExample.Builder b=new BuilderExample.Builder(10,20);
                b.param3(10);
                b.param4(20);
                BuilderExample test3= b.build();
                b.param5(17);
                b.param3(16);
                BuilderExample test4= b.build();
*/


    }
}