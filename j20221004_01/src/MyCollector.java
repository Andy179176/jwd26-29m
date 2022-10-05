import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MyCollector implements  Collector<String, Set<String>, List<String>> {
    @Override
    public Supplier<Set<String>> supplier() {
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<String>, String> accumulator() {
        return (set,str)-> set.add(new StringBuilder(str).reverse().toString());
    }

    @Override
    public BinaryOperator<Set<String>> combiner() {
        return (set1,set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<String>, List<String>> finisher() {
        return set-> new ArrayList<>(set);
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.UNORDERED);
    }
}
