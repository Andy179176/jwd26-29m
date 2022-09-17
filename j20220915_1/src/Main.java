import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //1
        List<Integer> list = List.of(3, 2, 11, 6, 3,17,0,5);
        Optional<Integer> res1 = list.stream()
                .filter(i->i<0)
                .reduce((acc, i) -> acc + i);
        System.out.println(res1.map(i->i*2));

        System.out.println("-------------------------------------");
        Integer res2 = list.stream()
                .filter(i->i<0)
                .reduce(123456,(acc, i) -> acc + i);
        System.out.println(res2);

// (123456, #1) - res1
// (res1, #2) - res2
// (res2, #3) - res3
        //.....

        System.out.println("----------------- 3 --------------------");
        List<String> list3 = List.of("3", "2", "11", "6", "3","17","0","5");
        Integer res3 = list3.stream()
                //.map(s->s.length())
                .reduce(0, (Integer acc, String i) -> acc + i.length(), (i1, i2) ->null);
        System.out.println(res3);



        //2
        System.out.println("------------------ 4 -----------------");
        List<Integer> list2 = List.of(3, 2, 11, 6, 3,17,0,5);
        List<String> list4 = List.of("3", "2", "11", "6", "3","17","0000","5");
        Optional<String> res4 = list4.stream()
                //.filter(i->i<0)
                //.max(Comparator.comparingInt(s->s.length()));
                .min(Comparator.comparingInt(s->s.length()));

        System.out.println(res4);

        System.out.println(list4.stream().filter(s->s.length()>3).count());
        System.out.println(Stream.iterate(1, i -> i + 1).limit(10).sorted().count());

    }
}

/*
(acc T,stream T  ) -> T
(acc R, stream T ) -> R

reduce(BinaryOperator accumulator);
reduce(seed,BinaryOperator accumulator);


reduce(seed,BiFunction accumulator, combiner);



 */