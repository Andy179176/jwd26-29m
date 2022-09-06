public class BankAccount {
    private Person person;
    private String iban;
    private double balance;

    public BankAccount(Person person, String iban, double balance) {
        this.person = person;
        this.iban = iban;
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return  String.format("%s iban: %s (%5.2f)",person,iban,balance);
                //person + " iban= " + iban + " (" + balance + ")";
    }
}
