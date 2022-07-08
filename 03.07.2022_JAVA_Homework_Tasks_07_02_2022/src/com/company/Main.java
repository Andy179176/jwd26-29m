package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	String str1="Hello";
	String str2="Aloha";
	String str3="Hello java";
	String str4="Hola";
	String str5="Guten morgen";
	String str6="Hello java world";
	String str7=" java world is easy";
	String str8=" java world is easy";
	String str9=" java world is easy";

        List<String> stringList= new ArrayList<>();
        stringList.add(str1);
        stringList.add(str2);
        stringList.add(str3);
        stringList.add(str4);
        stringList.add(str5);
        stringList.add(str6);
        stringList.add(str7);
        stringList.add(str8);
        stringList.add(str9);

        System.out.println(("The List from unique strings: "+newStringsList(stringList)));


        System.out.println("----------Task List 3 best Students from Groups---------------");

        Student student1= new Student("Jack",4);
        Student student2= new Student("John",3);
        Student student3= new Student("Jessy",5);
        Student student4= new Student("Jonatan",8);
        Student student5= new Student("Jopa",9);
        Student student6= new Student("Ivan",1);
        Student student7= new Student("Buba",0);
        Student student8= new Student("Alex",10);
        Student student9= new Student("Alexandr",7);
        Student student10= new Student("Julia",8);
        Student student11= new Student("Olga",5);
        Student student12= new Student("Elena",6);
        Student student13= new Student("Alena",2);
        Student student14= new Student("Alexey",3);
        Student student15= new Student("Norbert",4);

        List<Student> studentList1= new ArrayList<>();
        studentList1.add(student1);
        studentList1.add(student2);
        studentList1.add(student3);
        studentList1.add(student4);
        studentList1.add(student5);

        List<Student>studentList2=new ArrayList<>();
        studentList2.add(student6);
        studentList2.add(student7);
        studentList2.add(student8);
        studentList2.add(student9);
        studentList2.add(student10);
        studentList2.add(student4);
        studentList2.add(student1);

        List<Student>studentList3=new ArrayList<>();
        studentList3.add(student11);
        studentList3.add(student12);
        studentList3.add(student13);
        studentList3.add(student14);
        studentList3.add(student15);
        studentList3.add(student8);
        studentList3.add(student1);

        Group group1=new Group("Group1: ",studentList1);
        Group group2=new Group("Group2: ",studentList2);
        Group group3=new Group("Group3: ",studentList3);

        List<Group>groupList=new ArrayList<>();
        groupList.add(group1);
        groupList.add(group2);
        groupList.add(group3);

        System.out.println(groupList);
        Group groupSt4=new Group("group 4",List.of(student2));
        List<Group>groupList4=new ArrayList<>();
        groupList4.add(groupSt4);
        System.out.println(bestThreeStudentsList(groupList4));
        System.out.println("++++++++++");
        System.out.println("The best three students are: "+bestThreeStudentsList(groupList));


    }



    public static List<String> newStringsList(List<String>stringList){

        List<String>newListStrings=new ArrayList<>();
        if (stringList==null || stringList.isEmpty())return newListStrings;

       LinkedHashSet<String>stringHashSet=new LinkedHashSet<>();


        for (String str :stringList) {
            if (str!=null && str.trim().split(" ").length>=2) {
                stringHashSet.add(str);
            }
        }
        newListStrings.addAll(stringHashSet);
        return newListStrings;
    }

    public  static List<Student> bestThreeStudentsList(List<Group>groupList) {
        List<Student> resStudents = new ArrayList<>();
        if (groupList.isEmpty()) return resStudents;

            TreeSet<Student> studentTreeSet = new TreeSet<>();

            for (Group gr : groupList) {
                studentTreeSet.addAll(gr.getStudentsList());

            }

            if (studentTreeSet.size() <= 3) return new ArrayList<>(studentTreeSet);
            for (int i = 0; i < 3; i++) {

                resStudents.add(studentTreeSet.pollFirst());
            }

            return resStudents;
    }

}
