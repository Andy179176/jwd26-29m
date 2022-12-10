public class Person {
    private String name;
    private int age;
    private  Object lock= new Object();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public synchronized String getName() {
            return name;
    }

    public synchronized void setNameAndAge(String name, int age) {
            this.name = name;
            this.age= age;
    }

    public synchronized int getAge() {
        return age;
    }


}
