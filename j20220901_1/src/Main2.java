import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        MyPredicate p1= s -> s.length()>5;
        StringTransformer st1= s->s.toLowerCase();

        qwe("QWERTYFGghjk",st1,p1);

        p1= s -> s.startsWith("S");
        st1= s-> s.toUpperCase();
        qwe("SQWERTYFGghjk",st1,p1);

        qwe("qwertyui", s->s.substring(0,4), s->s.length()>4);
    }


    public  static void qwe(String s, StringTransformer tr,MyPredicate predicate){
        if ( predicate.test(s)  ) {
            System.out.println(tr.transform(s));
        } else {
            System.out.println("false");
        }

    }

}



