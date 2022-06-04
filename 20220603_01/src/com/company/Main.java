package com.company;

public class Main {

    public static void main(String[] args) {
        //Parent parent = new Parent("11");

        Child1 child1 = new Child1("111");
        Parent child1_1= new Child1("1111");
        Child2 child2 = new Child2("222");
        Grandson grandson = new Grandson("331");

        //System.out.println("---------- Parent -----------");
        //System.out.println(parent.doSomeThing1());
        //System.out.println(parent.doSomeThing2());

        System.out.println("---------- Child1 -----------");
        System.out.println(child1.doSomeThing1());
        System.out.println(child1.doSomeThing2());
        System.out.println(child1_1.doSomeThing2());




        /*

        System.out.println("---------- Child2 -----------");
        System.out.println(child2.doSomeThing1());
        System.out.println(child2.doSomeThing2());

        System.out.println("---------- Grandson -----------");
        System.out.println(grandson.doSomeThing1());
        System.out.println(grandson.doSomeThing2());

 */
    }
}
