package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] integers = {
                Integer.valueOf(1),
                Integer.valueOf(17),
                Integer.valueOf(-4),
                Integer.valueOf(8),
        };

        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));


        User u1 = new User("Jack", 31,"jack12@mael.org");
        User u2 = new User("Jhon", 21,"ert@mael.org");
        User u2a = new User("Jhon", 10,"ert1@mael.org");
        User u2b = new User("Jhon", 29,"ert2@mael.org");
        User u3 = new User("Nick", 19,"qwe@mael.org");
        User u4 = new User("Anna", 23,"anna@mael.org");
        User u5 = new User("Antony", 45,"ganibal@mael.org");

        User[] users = {u1,u2,u3,u4,u5,u2a,u2b};
        print(users);
        System.out.println("------------- sort by age");

        Comparator<User> comparator= new UserByAgeComparator();
        //List<User> list = new ArrayList<>();
        //Arrays.sort(users,comparator);
        print(users);

        System.out.println("------------- sort by name");
        Arrays.sort(users,new UserByNameComparator());
        print(users);

        System.out.println("------------- sort by name and by age");
        Arrays.sort(users,new UserByNameComparator().thenComparing(comparator));
        print(users);



        System.out.println("------------- sort by default (use Comparable, email)");
        Arrays.sort(users);
        print(users);


        List<String> strings = new ArrayList<>();
        strings.add("uiy");
        strings.add("y");
        strings.add("ykfd;k;s");
        strings.add("ykfd;");
        strings.add("ykfwlohewd;");
        strings.add("w");
        strings.add("w;lkjhgfdsasdfghjkl;';lkjhgf");
        strings.add("w;f");
        strings.sort(new StringByLengthComparator());

        System.out.println(strings);

    }
    public static void print(User[] user){
        for (User u:user ) {
            System.out.println(u);
        }
    }




}
