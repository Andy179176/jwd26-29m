import java.util.Random;

public class Temp {
    public static void main(String[] args) {
        System.out.println(m1());
        System.out.println(m2());
        }
    public static int m1(){
        Random rnd = new Random(System.currentTimeMillis());

        return rnd.nextInt();
    }

    public static int m2(){
        Random rnd = new Random(System.currentTimeMillis());

        return rnd.nextInt();
    }
}
