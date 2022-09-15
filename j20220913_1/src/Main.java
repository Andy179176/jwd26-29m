import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<String> s = Optional.of(new String("1234"));


        Optional<Integer> reduce = List.of(1, 99, 1, 0, 6, 7).stream()
                .filter(i->i<0)
                .reduce((i1, i2) -> Math.max(i1, i2));

        System.out.println(reduce.orElseGet(() -> new Random(System.currentTimeMillis()).nextInt()));

        System.out.println("---------------------------------------");
        Integer reduce2 = List.of(1, 99, 1, 0, 6, 7).stream()
                .filter(i->i<0)
                .reduce(0,(i1, i2) -> i1+i2); //  (0,1) ->res1     (res1,99) -> res2     (res2,1) - res3

        System.out.println(reduce2);

        Stream.of(
                new Person("Jack1",10),
                new Person("Jack2",10),
                new Person("Jack3",10)
        )
                .reduce(0,(Integer a1,Person a2)->a1+a2.getAge(), (s1,s2)->s1);



        //System.out.println();

        /*
          (1,2) -> 2
          (2,100) -> 100
          (100,4) ->100
          (100,5) ->100
          (100,6) ->100
         */
        Person[] people ={
                new Person("Jack"),
                new Person("Jack1"),
                new Person("Jack2")
        };
        findFirstStartWith(people,"Jack").ifPresentOrElse(
                (person -> {
                    System.out.println(person);



                }),()->{
                    System.out.println("персон не найден");
                }

        );


        Person p = findFirstStartWithNull(people,"Jack");



    }

    public static Optional<Person> findFirstStartWith(Person[] arr, String str){
        for (Person s: arr){
            if(s.getName().startsWith(str)) return Optional.of(s);
        }
        return Optional.empty();
    }

    public static Person findFirstStartWithNull(Person[] arr, String str){
        for (Person s: arr){
            if(s.getName().startsWith(str)) return s;
        }
        return null;
    }

}