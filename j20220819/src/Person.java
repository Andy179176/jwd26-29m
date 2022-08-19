//STATIC

public class Person {
    static private int counter =0;
    static private  int resource= 3;

    private String name;
    private int id;


    public Person(String name) {
        counter++;
        this.name = name;
        this.id = counter;

    }

    @Override
    public String toString() {
        return  "["+id+"]   "+ name +" counter:"+ counter;
    }

    public  void getSomething(){
        if(resource>0){
            System.out.println(name + " взял 'что то' Осталось: " + resource);
            resource--;
        } else {
            System.out.println(name + " не взял 'что то'. Все кончилось!" );

        }
    }

}
