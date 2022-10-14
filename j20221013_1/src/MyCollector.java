import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MyCollector implements Collector<BankAccountWithOwner, Map<Person, Set<String>>, List<PersonWithBankAccount>> {
    @Override
    public Supplier<Map<Person, Set<String>>> supplier() {
        return HashMap::new;
    }

    @Override
    public BiConsumer<Map<Person, Set<String>>, BankAccountWithOwner> accumulator() {
        return (map,ba)->{
            Set<String> set = map.getOrDefault(ba.getOwner(), new HashSet<>());
            set.add(ba.getIban());
            map.put(ba.getOwner(),set);
        };
    }

    @Override
    public BinaryOperator<Map<Person, Set<String>>> combiner() {
        return (map1,map2)->{
            for (Person p: map2.keySet()){
                Set<String> set1 = map1.getOrDefault(p, new HashSet<>());
                Set<String> set2 = map2.getOrDefault(p, new HashSet<>());
                set1.addAll(set2);
                map1.put(p,set1);
            }
            return map1;
        };
    }

    @Override
    public Function<Map<Person, Set<String>>, List<PersonWithBankAccount>> finisher() {
        return null;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }
}
