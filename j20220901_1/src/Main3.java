import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main3 {
    public static void main(String[] args) {
        qwe("qwertyui", s -> s.toUpperCase(),s->s.startsWith("q") );


    }
 //String x(String s)

    public  static void qwe(String s, Function<String,String> tr, Predicate<String> predicate){
        if ( predicate.test(s)  ) {
            System.out.println(tr.apply(s));
        } else {
            System.out.println("false");
        }
    }

}



