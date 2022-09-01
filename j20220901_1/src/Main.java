import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        MyPredicate p1= new MyPredicateImpl();
        qwe("qwert", p1);
        MyPredicate p2 = new MyPredicateImpl2();
        qwe("qwer",p2);


        MyPredicate p3 = new MyPredicate() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        };
        qwe("qwer",p3);

        MyPredicate p4 = (String str)->{ return str.startsWith("A"); };
        MyPredicate p5 = str->str.endsWith("A");
        qwe("qwer",p4);
        qwe("qwer",p5);


    }


    public  static void qwe(String s, MyPredicate predicate){
        if ( predicate.test(s)  ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}



