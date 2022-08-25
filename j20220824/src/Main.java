public class Main {
    public static void main(String[] args) {
        MyDate d1= new MyDate(10,8,2000);
        MyDate d2= new MyDate(10,9,2000);


        d1.print();
        d1.specialCheckingAndPrint();
        d2.print();
        d2.specialCheckingAndPrint();
    }
}