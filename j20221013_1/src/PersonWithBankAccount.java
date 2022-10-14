import java.util.List;

public class PersonWithBankAccount {
    private String name;
    private List<String> ibans;

    public PersonWithBankAccount(String name, List<String> ibans) {
        this.name = name;
        this.ibans = ibans;
    }

    @Override
    public String toString() {
        return name + ": " + ibans;
    }
}
