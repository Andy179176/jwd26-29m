import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {

        List<Person2> person2 = List.of(
                new Person2("Jack", List.of("jack1@mail.de", "jack2@mail.de")),
                new Person2("Nick", List.of("nick1@mail.de", "nick2@mail.de", "nick3@mail.de")),
                new Person2("John", List.of("John@mail.de"))
        );

        person2.stream()
                .flatMap(p->p.getEmails().stream())
                .forEach(l-> System.out.println(l));

        Random rnd=new Random(System.currentTimeMillis());
        System.out.println(Stream.generate(() -> rnd.nextInt()).limit(100).collect(Collectors.toList()));
        Stream.iterate(2,i->i+2).limit(50).forEach(i-> System.out.println(i));
        System.out.println("---------------------------------------------------");
        Stream.iterate(2,i->i<70,i->i+2).forEach(i-> System.out.println(i));
        System.out.println("--------");

        System.out.println("---------------------------------------");
        System.out.println(Stream.generate(() -> rnd.nextInt(10)).limit(3).distinct().collect(Collectors.toList()));


    }
}
