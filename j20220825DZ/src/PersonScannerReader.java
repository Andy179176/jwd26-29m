import Exceptions.IncorrectDateException;
import Exceptions.PersonReaderException;
import Exceptions.UserInterruptException;

import java.util.Scanner;

public class PersonScannerReader implements PersonReader {
    private static final String msgInputPerson = "Input the name of the person or 'finish' to cancel: ";
    private static final String msgInputBirthday = "Input the birthday (dd-mm-yyyy) of the person or 'finish' to cancel: ";
    private static final String errMsgInputPerson = "The name <%s> is not valid. ";
    private static final String errMsgInputBirthday = "The date <%s> is not valid. ";
    private static final String interruptStr = "finish";

    private static Scanner scanner= new Scanner(System.in);
    public  Person getPerson() throws PersonReaderException {
        String name = readPersonName();
        MyDate date = readMyDate();
        return new Person(name,date);
    }

    private static String readPersonName() throws UserInterruptException {
        String res;
        do {
            System.out.println(msgInputPerson);
            res = scanner.nextLine();
            ifInterrupt(res);
            if (Person.isNameValid(res)) {
                return res.trim();
            } else {
                System.out.printf(errMsgInputPerson,res);
            }
        } while (true);
    }

    private static MyDate readMyDate() throws UserInterruptException {
        String dateString;
        MyDate res;
        boolean inputted=false;
        do {
            System.out.println(msgInputBirthday);
            dateString = scanner.nextLine();
            ifInterrupt(dateString);
            try {
                res=MyDate.valueOf(dateString);
                return res;
            } catch (IncorrectDateException e) {
                System.out.printf(errMsgInputBirthday,dateString);
            }
        } while (true);
    }

    private static void ifInterrupt(String res) {
        if (res.trim().toLowerCase().equals(interruptStr))
            throw new UserInterruptException();
    }

}
