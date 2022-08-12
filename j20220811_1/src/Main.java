import java.util.List;

public class Main {
    public static void main(String[] args) {


    }

    static void add10(Box1 box1){
        if(box1.getValue() instanceof Integer) {
            box1.setValue(((Integer) box1.getValue() + 10));
        }
    }

}