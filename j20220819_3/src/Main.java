/*
nested [static] class
inner  [not-static] class
local class

anonymous class


    // 'IS A' relationship
    // 'HAS A' relationship   (part of )

 */

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("Samsung",new Phone.CPU("Exynos",8));
        Phone.CPU cpuSnapDragon= new Phone.CPU("Snapdragon 845",8);

        System.out.println(Phone.CATEGORY); // static as constant
        System.out.println(phone);

    }
}