import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/*
Дан список Programmer. У каждого Programmer(String name, String city, List<String> skills)
есть список технологий (String), которыми он владеет.
Сформировать лист из всех технологий, которыми владеют сотрудники.

 */
public class Main {
    public static void main(String[] args) {
        List<Programmer> programmers = List.of(
                new Programmer("Jack", "Berlin", List.of("Java", "C++", "Go")),
                new Programmer("John", "Berlin", List.of("Java", "SQL")),
                new Programmer("Nick", "Bohn", List.of("JavaScript", "CSS", "HTML")),
                new Programmer("Stan", "Dresden", List.of("Java", "C++", "Go"))
        );
        System.out.println(programmers);
        System.out.println("-----------------------------------");
        getAllSkills(programmers).forEach(s->System.out.println(s));
        System.out.println("---------------- 2 ------------------");
        getSkillProgrammer(programmers).forEach(s->System.out.println(s));

    }
    public static List<String> getAllSkills(List<Programmer> programmers){
        return programmers.stream()
                .flatMap(p-> p.getSkills().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    /*
 Дан список Programmer. У каждого Programmer есть список технологий (String),
которыми он владеет. Сформировать лист из строк вида
«технология: имя программиста» отсортированный по технологии.

     */
    public static List <String> getSkillProgrammer(List<Programmer> programmers){
        return programmers.stream()
                .flatMap(p->p.getSkills().stream().map(st->st+":"+p.name))
                .sorted((s1,s2)->s1.substring(0, s1.indexOf(":"))
                        .compareTo(s2.substring(0, s2.indexOf(":"))))
                .collect(Collectors.toList());
    }

}