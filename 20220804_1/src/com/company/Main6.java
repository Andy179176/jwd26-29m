package com.company;



public class Main6 {
    public static void main(String[] args) {



        Obj o1= new Obj();
        o1.num=10;
        Obj o2 = o1;
        System.out.println(o2);
        o2.num=12;
        System.out.println(o1);

        System.out.println("------------------------------");
        String str="hello";
        String str2= str;
        String str1= new String("hello");
        str1=str1.intern();

        System.out.print("str==str2  "); System.out.println(str==str2);
        System.out.print("str==str1  "); System.out.println(str==str1);
        System.out.print("str.equals(str1)  "); System.out.println(str.equals(str1));
        str2= str2+"1";
        System.out.println(str);
        System.out.println(str2);

        str2=str2.toUpperCase();



    }

}

class Obj{
    public int num;

    @Override
    public String toString() {
        return ""+num;
    }


}
