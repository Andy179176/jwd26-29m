import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3,82,25,8);
        System.out.println(add(list)); //121

    }
/*
    public static long add(List<Integer> list) {
        return list.stream().reduce(0,(i1,i2)->{
            if(i2<0){
                return i1+Math.abs(i2);
            } else {
                return i1+i2;
            }
        });
    }
*/
    public static long add(List<Integer> list) {
        return list.stream().reduce(0,(i1,i2)->{
                return i1+i2;
        });
    }


}