import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(Stream.of("ww", "gg", "uu", "qwer", "cc", "kk", "JJ", "uu", "ww")
                .collect(Collectors.collectingAndThen(Collectors.toCollection(TreeSet::new),
                        (TreeSet s) -> s.tailSet("kk"))));


        IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 3, 4).summaryStatistics();
        intSummaryStatistics.getMax();
        intSummaryStatistics.getAverage();

        System.out.println(
                Stream.of("ww", "gg", "uu", "qwer", "cc", "kk", "JJ", "uu", "ww")
                        .collect(Collectors.summarizingInt(String::length))
        );

        System.out.println(Stream.of(11, 33, 4, 1, 555, 1, 4, 5, 6, 2, 0)
                .collect(Collectors.teeing(
                        Collectors.minBy(Comparator.comparing(Integer::intValue)),
                        Collectors.averagingInt(Integer::intValue),
                        (Optional<Integer> m, Double a) -> a - m.orElse(0)
                )));


        System.out.println(Stream.of("Jack", "Nick", "John")
                .collect(Collectors.joining("][", "[", "]")));

        System.out.println(Stream.of("Jack", "Nick", "John").collect(
                 StringBuilder::new,
                (StringBuilder sb, String s) -> sb.append('[').append(s).append(']'),
                (sb1, sb2) -> sb1.append(sb2)
        ).toString());
        //   "[Jack][Nick][John]"

       //-------------------------------------------------------
        System.out.println(Stream.of("Jack", "Nick", "John").collect(new MyCollector()));


    }





}