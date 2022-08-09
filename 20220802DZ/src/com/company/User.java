/* У вас в программе создается User (User {String firstName, String lastName, int age,email}).
При этом, в конструктор приходит строка вида “John;Lennon;40;lennon@mail.com”
Система должна либо создавать объект, либо формировать Exception.
При этом, должна быть возможность получить все ошибки, которые привели к не созданию объекта.
Например:
Некорректный формат строки. В строке не хватает данных
Поле не задано (пустое)
email имеет неправильный формат: короче 4 символов или не содержит символ @.
Поле возраст некорректно
В строке больше полей, чем необходимо    */


package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;




    public User(String userString) throws UserCreateException {
        List<String> errList = new ArrayList<>();
        if(userString==null || userString.isEmpty()){
            errList.add("The user string is NULL or empty");
            throw new UserCreateException(errList);
        }
        parseString(userString,errList);
        if(errList.size()!=0) throw new UserCreateException(errList);
    }

    private void parseString(String userString,List<String> errList){
        String[] arr = userString.split(";");
        if(arr.length!=4){
            errList.add("The string: <"+ userString +
                    "> has wrong number of fields");
            return;
        }

        if(!isNotNullOrEmpty(arr[0])){
            errList.add("The firstName  : <"+ arr[0] +
                    "> not correct");
        } else {
            this.firstName=arr[0];
        }

        if(!isNotNullOrEmpty(arr[1])){
            errList.add("The lastName  : <"+ arr[1] +
                    "> not correct");
        } else {
            this.lastName=arr[1];
        }

        try{
            this.age=parseAge(arr[2]);
        } catch (Exception e){
            errList.add("The age  : <"+ arr[2] +
                    "> not correct");
        }

        if(!checkEmail(arr[3])){
            errList.add("The email  : <"+ arr[3] +
                    "> not correct");
        } else {
            this.email=arr[3];
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    /*
        private boolean checkEmail(String email){
            return isNotNullOrEmpty(email) &&
                    email.length()>4 &&
                    email.contains("@");
        }
    */
    private int parseAge(String age) throws Exception {
        if (!isNotNullOrEmpty(age)){
            throw new Exception();
        }
        int res=Integer.parseInt(age);
        if(res<0 || res>200) throw new Exception();
        return res;
    }
    private boolean checkEmail(String email){
        if (isNotNullOrEmpty(email)){
            String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
            Pattern p = Pattern.compile(ePattern);
            Matcher m = p.matcher(email);
            return m.matches();
        }
            return false;
    }



    private boolean isNotNullOrEmpty(String str ){
        return str!=null && !str.isEmpty();
    }

}
