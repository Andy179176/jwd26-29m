public class Main {
    /*   Используя знания о не статических внутренних классах придумать и реализовать пример из любой близкой
       вам предметной области. (Для тех кому сложно придумать реализуйте класс Person и класс Passport по
       примеру классов BankAccount и Card c урока)*/
    public static void main(String[] args) {

        Person.Passport passport11 = new Person("Ivan", "Ivanov", 1900).new Passport(20394, "DE");
        System.out.println(passport11);

    }
}