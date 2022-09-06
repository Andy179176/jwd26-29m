import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List.of("qwe1","qwe333", "qwe22","qwe4444", "qwe1","qwe4444", "qwertyu" )
                .stream()
                .filter(s->s!=null && !s.isEmpty() && s.length()<=5 )
                .forEach(s-> System.out.println(s));




        System.out.println("---------------------- 2 ----------------------------");
        IntStream.of(1,2,-1,5,9,2)
                .filter(i->i>=0)
                .sorted()
                .forEach(i-> System.out.println(i));

        System.out.println("---------------------- 3 ----------------------------");
        List<String> qwe1 = List.of("qwe1", "qwe333", "qwe22", "qwe4444", "qwe1", "qwe4444", "qwertyu");
        qwe1.stream()
                .filter(s->s!=null && !s.isEmpty() && s.length()<=5 )
                .map(s->s+" stream")
                .forEach(s-> System.out.println(s));
        System.out.println(qwe1);



        System.out.println("---------------------- 4 ----------------------------");
        List<Integer> qwe2 = List.of(1,2,3,4,5);
        qwe2.stream()
                .filter(i->{
                    System.out.println(" point1: " + i);
                    return i<0;
                } )
                .map( i->{
                    System.out.println("  point2: " + i);
                    return i*10;
                })
                .forEach(s-> System.out.println("   point3: "+s));



        System.out.println("---------------------- 5 ----------------------------");
        List<Person> people = List.of(
                new Person("Jack",10),
                new Person("John",35),
                new Person("Ann",22),
                new Person("Mike",15),
                new Person("Stan",45)
        );
        List<String> result = people.stream()
                .filter(p -> p.getAge() > 16)
                .map(p -> p.getName())
                .map(s -> s.length())
                .map(i -> "Hello you are "+ String.valueOf(i) + " years old")
                .collect(Collectors.toList());
        System.out.println(result);


        for (int i = 0; i < args.length ; i++) {
            if(args[i]!=null){
                args[i]=args[i]+" stream";
                System.out.println(args[i]);
            }
        }



    }
}