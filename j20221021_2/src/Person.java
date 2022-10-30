import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -1135998539418156440L;
    private String name;
    private  int age;
    transient BankAccount account;

    public Person(String name, int age, BankAccount account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " /" + age +" / " + account.account;
    }
}