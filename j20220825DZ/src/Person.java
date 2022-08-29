public class Person {
    private String name;
    private MyDate birthday;

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public static boolean isNameValid(String name){
        if(name==null) return false;
        String reg="[A-Za-zА-Яа-я ]{2,}";
        return name.trim().matches(reg);
    }

    @Override
    public String toString() {
        return name + "(" +birthday +")";
    }
}
