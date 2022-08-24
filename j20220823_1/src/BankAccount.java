public class BankAccount {
   private final String owner;
   private final String IBAN;
   private double balance;

    public BankAccount(String owner, String IBAN, double balance) {
        this.owner = owner;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + owner + " " + IBAN + " " + balance;
    }

     private double withdraw(double amount){
        balance-=amount;
        return balance;
    }




    public class Card {
        private String owner;
        private String number;


        public Card(String owner, String number) {
            this.owner = owner;
            this.number = number;
        }

        public Card(String number) {
            this.number = number;
            this.owner=BankAccount.this.owner;
        }

        @Override
        public String toString() {
            return "Card /" +owner + " " + number +" "+ BankAccount.this.balance +"/";
        }

        public double cardWithdraw(double amount){
            return BankAccount.this.withdraw(amount);
        }
    }

}
