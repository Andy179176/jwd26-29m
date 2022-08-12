public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello worldQWE!");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }


        m("1","2","3");
        m("1","2");
        m();
        m("1","2","3","55");
    }

    public static void m(String... qwe){
        System.out.println("----------------------");
        for (int i = 0; i <qwe.length ; i++) {
            System.out.println(qwe[i]);
        }
    }

    public static void m(String q1, String q2){
        System.out.println("----------------------");
        System.out.println("!:" +q1+q2);
    }


}