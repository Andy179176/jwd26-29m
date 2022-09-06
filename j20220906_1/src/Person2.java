import java.util.List;

public class Person2 {
    private String name;
    private List<String> emails;

    public Person2(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", emails=" + emails +
                '}';
    }
}
