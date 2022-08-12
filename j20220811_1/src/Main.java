import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List j= new ArrayList();
        List<String> j1= new ArrayList<String>();
        List<String> j2= new ArrayList<>();
        j2.add("qwer");

        Integer[] integers ={1,2,3};
        String[] strs ={"q1","q2","q3"};

        Integer i=print(integers,12);
        System.out.println("Res:"+i);

        Integer i2=print(strs,integers[2]);
        System.out.println("Res:"+i2);

        String s=print(strs,"integers[2]");
        System.out.println("Res:"+s);



        /*

        Number          Double
        List<Number>    List<Double>


         */

    }

    public static <E,V> V print(E[] arr, V value){
        for (E e:arr) {
            System.out.println(e);
        }
        return value;
    }


    public static <T>void copy(List<? super T> dest, List<? extends T> src){
        for (T element:src) {
            dest.add(element);

        }
    }





    /*
    PECS - Producer Extends, Consumer Super

    Employee
        Programmer
             CProgrammer  (List<CProgrammer>,List<Programmer>, List<Employee>,List<Object> -> super CProgrammer
             JavaProgrammer
        Manager



     */



    static void add10(Box1 box1){
        if(box1.getValue() instanceof Integer) {
            box1.setValue(((Integer) box1.getValue() + 10));


        }

    }



}