
public class Main {

    public static void main(String[] args) {

        if(args.length!=0) {
            for (int i = 0; i <args.length ; i++) {
                System.out.println("Привет "+args[i]);
            }
        }

        boolean isOk=true;

        int age=18;
/*
        if(age<18){
            System.out.println("Получать права рано");
        } else {
            System.out.println("можно получить права");
        }

        System.out.println("программа завершена. Ответ получен");
*/
        for(age=10;age<18;age++) {
            System.out.println("age " + age);
            System.out.println("Получать права рано");
            //age++;
            System.out.println("Прошол год....");
            System.out.println();
        };

        System.out.println("Дождались!!!! age "+ age);
        System.out.println("можно получить права");
        System.out.println("программа завершена.");




/*
        while (age<18) {
            System.out.println("age " + age);
            System.out.println("Получать права рано");
            age++;
            System.out.println("Прошол год....");
            System.out.println();
        };

        System.out.println("Дождались!!!! age "+ age);
        System.out.println("можно получить права");
        System.out.println("программа завершена.");

 */
        /*
        for(int age=10){}
        while(){}

        do...while(){}


        1) повторение кода -тела цикла
        2) условие, пока true выполняем тело цикла false - останавливаемся, выходим из цикла

         */



    }
}
