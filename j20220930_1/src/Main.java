import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        System.out.println("1: "+Stream.of(90,5,-4, 77, 1, 2,2, 3, 4,4, 5, 6)
                .collect(Collectors.toSet()));


        System.out.println("2: "+Stream.of(90,5,-4, 77, 1, 2,2, 3, 4,4, 5, 6)
                .collect(Collectors.toUnmodifiableList()));


        System.out.println("3: "+Stream.of(90,5,-4, 77, 1, 2,2, 3, 4,4, 5, 6)
                .collect(Collectors.toCollection( ()-> new ArrayList<>(1000)   )));

        System.out.println("4: "+Stream.of("qwe1","qwe2","qwe3")
                .collect( Collectors.joining("-","<",">") ));

        System.out.println("5: "+Stream.of(90,5,-4, 77, 1, 2,2, 3, 4,4, 5, 6)
                        .distinct()
                .collect(Collectors.toMap(i->i,i->i)));
        //Map<key, value>

         // key, List<>()
        // groupingBy
        Map<Integer, List<String>> map = Stream.of("aa", "qwer", "ha", "iuy", "jaa", "io")
                .collect(Collectors.groupingBy(String::length));
        System.out.println("6:  "+ map);


        Map<String, Long> map1 = Stream.of("aa","aa", "qwer", "ha", "iuy", "jaa", "io")
                .collect(Collectors.groupingBy(s->s, Collectors.counting()));
        System.out.println("7:  "+ map1);

        Map<Boolean, List<String>> map2 = Stream.of("aa", "aa", "qwer", "ha", "aadfghj", "iuy", "aa123", "jaa", "io")
                .collect(Collectors.partitioningBy(s -> s.startsWith("aa")));
        System.out.println("8:  "+ map2);


        Map<String, List<String>> map4a = Stream.of("aa", "aa", "qwer", "ha", "iuy", "jaa", "io")
                .collect(Collectors.groupingBy(s -> s));
        System.out.println("8a:  "+ map4a);

        Map<String, List<String>> map4 = Stream.of("aa", "aa", "qwer", "ha", "iuy", "jaa", "io")
                .collect(Collectors.groupingBy(s -> s, Collectors.mapping(s ->s.toUpperCase(), Collectors.toList())));
        System.out.println("8:  "+ map4);

        //Stream.of("1234","45678","78").collect(Collectors.mapping(String::length,Collectors.toList()));


/*
        Stream.of("aa", "qwer", "ha", "iuy", "jaa", "io")
                .collect(Collectors.groupingBy(String::length))
                .entrySet().stream()
                .collect(Collectors.toMap(e->e.getKey(),e-> e.getValue().size()));
*/
    }
}