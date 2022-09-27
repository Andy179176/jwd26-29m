import java.util.List;

public class Source {
    public static final List<Person> personList = new ArrayList<>(List.of(
            new Person("Roman", "r", -1),
            new Person("Roman", "", 27),
            new Person("Roman", null, 27),
            new Person(null, "r", 27),
            new Person("", "r", 27),
            new Person("Anna", "Richert", 24),

            new Person("Anna", "Richert", 24),
            new Person("Oxana", "Rogova", 39),
            new Person("Kirill", "Grigoriev", 18),
            new Person("Roman", "Richert", 27)));
}