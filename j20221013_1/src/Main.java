import java.util.List;

/*
Даны следующие классы: Person {String name;},
BankAccountWithOwner{Person owner;String iban;}
и данс писок банковских счетов List<BankAccountWithOwner> accounts.

Написать функцию, которая вернет List<PersonWithBankAccounts> persons (PersonWithBankAccount{String name;
List<String> ibans;}) такой, что к каждому человеку
прилагается список ibans его банковских счетов.

 */
public class Main {
    public static void main(String[] args) {
        List<BankAccountWithOwner> list = List.of(
                new BankAccountWithOwner(new Person("Jack"), "iban#1"),
                new BankAccountWithOwner(new Person("John"), "iban#2"),
                new BankAccountWithOwner(new Person("Stan"), "iban#3"),
                new BankAccountWithOwner(new Person("Jack"), "iban#4"),
                new BankAccountWithOwner(new Person("Jack"), "iban#5"),
                new BankAccountWithOwner(new Person("John"), "iban#6"),
                new BankAccountWithOwner(new Person("Nick"), "iban#7")
        );

        System.out.println(list);
    }


    public static List<PersonWithBankAccount> task1 (List<BankAccountWithOwner> accounts){
        return accounts.stream().collect(new MyCollector());
    }
}

