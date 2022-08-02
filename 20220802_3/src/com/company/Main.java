package com.company;






import com.company.exceptions.UserDataFileFormatNotCorrectException;
import com.company.exceptions.UserDataFileNotFoundException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileReader fr= openFileWithUserData();
        } catch (UserDataFileNotFoundException e) {
            e.print();

            e.printStackTrace();
        } catch (UserDataFileFormatNotCorrectException e){
            e.print();
        }
    }

    public static FileReader openFileWithUserData() throws UserDataFileNotFoundException
                                    ,UserDataFileFormatNotCorrectException {
        FileReader fr= null;
        try {
            fr = new FileReader("d:/tyu.txt");
        } catch (FileNotFoundException e) {
           throw new UserDataFileNotFoundException("файл с данными пользователей не найден");

        }

        if (!check(fr)){
            throw  new UserDataFileFormatNotCorrectException("файл с данными пользователей имеет не корректный формат");
        }

        return fr;
    }

    private static boolean check(FileReader fr) {
        return true;
    }


}
