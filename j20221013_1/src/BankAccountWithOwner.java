public class BankAccountWithOwner {
    private Person owner;
    private String iban;

    public BankAccountWithOwner(Person owner, String iban) {
        this.owner = owner;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return owner + "("+iban +")";
    }

    public Person getOwner() {
        return owner;
    }

    public String getIban() {
        return iban;
    }
}
