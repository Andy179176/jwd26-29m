package com.company;

public class PersonArray {
    Person[] array;
    int currentIndex;

    public PersonArray(Person[] array) {
        this.array = array;
        this.currentIndex =array.length;
    }

    public String toString(){
        String result="";
        for (int i = 0; i < currentIndex ; i++) {
            result=result+"["+array[i].toString()+"]";
        }
        return result;
    }

    public void add(Person p){
        if(currentIndex >=array.length){
            copyOff(currentIndex*2);
        }
        array[currentIndex]=p;
        currentIndex++;
    }

    public void copyOff(int newSize){
        Person[] newArray=new Person[newSize];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
    }



}
