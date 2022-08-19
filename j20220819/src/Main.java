public class Main {



    public static void main(String[] args) {

        Person p1=new Person("Jack1");
        System.out.println(p1);
        Person p2=new Person("Jack2");
        System.out.println(p2);
        Person p3=new Person("Jack3");
        System.out.println(p3);

        System.out.println("-------------------------------------");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p3.getSomething();
        p3.getSomething();
        p1.getSomething();
        p1.getSomething();

    }
}