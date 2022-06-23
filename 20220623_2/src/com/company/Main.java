package com.company;
/*
Пусть дан список List объектов типа User{String fName, String lName, int age }.
Необходимо исключить из списка всех пользователей моложе 18 лет.


 */
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> people= Arrays.asList(
                 new Person("a",10)
                ,new Person("b",10)
                ,new Person("c",10)
                ,new Person("d",20)
                ,new Person("e",30)
                ,new Person("f",15)
                ,new Person("g",25)
        );
        List<Person> list= new ArrayList<>(people);
        removeChildren(list);
        System.out.println(list);

        ListIterator<Person> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


    }

    public static void removeChildren0(List<Person> list){
        for (Person p: list){
            if(p.getAge()<18) list.remove(p); //error
        }
    }


    public static void removeChildren1(List<Person> list){ //error
        for (int i=list.size()-1;i>=0;i--){
            if(list.get(i).getAge()<18) list.remove(i);
        }
    }

    public static void removeChildren(List<Person> list){

        Iterator<Person> iterator=list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getAge()<18) iterator.remove();
        }
    }

}
