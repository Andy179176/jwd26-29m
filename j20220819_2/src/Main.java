// Singleton demo
public class Main {
    public static void main(String[] args) {
        //Singlton singlton = new Singlton("name0");  //!error 
        Singleton singleton1 = Singleton.getInstance("name1");
        Singleton singleton2 = Singleton.getInstance("name2");
        System.out.println(singleton1);
        System.out.println(singleton2);
    }

}