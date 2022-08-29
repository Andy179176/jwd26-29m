/*
Используя Scanner написать программу, которая позволяет пользователю ввести с клавиатуры
список Person {String name, MyDate birthday}    MyDate – класс {int day, int month, int year}.
Программа должна корректно обрабатывать вводимые пользователем данные,
проверять корректность данных и если данные некорректны, запрашивать повторный ввод.
Если пользователь ввел “finsh”, программа должна распечатать получившийся список пользователей
и завершить свое выполнение.
 */

import Exceptions.PersonReaderException;
import Exceptions.UserInterruptException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonReader reader=new PersonScannerReader();
        List<Person> people = getPersonList(reader);
        print(people);

    }

    private static List<Person> getPersonList(PersonReader reader) {
        List<Person> people= new ArrayList<>();
        boolean interrupted=false;
        while (!interrupted){
            System.out.println("Person "+(people.size()+1));
            try {
                Person p = reader.getPerson();
                people.add(p);
                System.out.println(p + " added!");
            } catch (UserInterruptException e){
                interrupted=true;
            } catch (PersonReaderException e){
                e.printStackTrace();
            } catch (Exception e){
                System.out.println("Ooopss!!!");
            }

        }
        return people;
    }

    private static void print(List<Person> people) {
        System.out.println("---------------------------------------------");
        System.out.println("Added " + people.size() + " persons:");
        for (Person p:people) {
            System.out.println(p);
        };
    }
}