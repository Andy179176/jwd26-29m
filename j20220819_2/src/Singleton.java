public class Singleton {
    private String name;


    private static Singleton instance;

    private Singleton(String name) {
        this.name=name;
    }

    public static Singleton getInstance(String name){

        if(instance==null){
            instance= new Singleton(name);
        }
        return instance;
    }

    public void print(){
        System.out.println(name);
    }


    @Override
    public String toString() {
        return name + " " + super.toString();
    }
}
