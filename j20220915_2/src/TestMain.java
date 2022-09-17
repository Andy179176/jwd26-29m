import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestMain {
    @Test
    public void testAdd2(){
        List<Integer> list = List.of(-1, -2, -3);
        Assertions.assertEquals(-6,Main.add(list));
    }
    @Test
    public void testAdd1(){
        List<Integer> list = List.of(1, 2, 3,82,25,8);
        Assertions. (121,Main.add(list));

    }

}
