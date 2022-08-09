package com.company;

public class Main {

    public static void main(String[] args) {

        try {
           User user = new User("John;Lennon;40;lennon@mail.com");
            //User user = new User(";Lennon;-40;lennonmail.com");
            //User user = new User("John;Lennon;lennonmail.com");
            System.out.println(user);
       } catch (UserCreateException e){
            System.err.println("User Create Exception");
            e.printErrorsList();
            e.printStackTrace();
       } catch (Exception e){
            System.out.println("Опс.....что то пошлло не так!");
            //e.printStackTrace();

       }


    }
}
