public class Main {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount("Jack","DE123456",200000);
        BankAccount.Card card1= ba.new Card("123");
        BankAccount.Card card2= ba.new Card("Ann","124");

        card1.cardWithdraw(100);
        card2.cardWithdraw(250);

        System.out.println(ba);
        System.out.println(card1);
        System.out.println(card2);

    }
}