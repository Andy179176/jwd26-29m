import java.util.List;

public class Main {
    // 2. Дан список Person (String firstName, String lastName, int age) используя Stream получить map<String, Integer>,
    // где ключ ФИО в формате Иванов.И, значение возраст.
    public static void main(String[] args) {
        System.out.println(personListToPersonMap(Source.personList));
    }
    public static Map<String, Integer> personListToPersonMap(List<Person> personList){
        if(personList == null || personList.isEmpty()) return Map.of();
        personList.removeIf(Person::isNull);

        return personList.stream()
                .collect(Collectors.toMap(
                        person -> String.format("%s %c.", person.getLastName(), person.getFirstName().charAt(0)),
                        Person::getAge,
                        (p1, p2)-> p2));
    }

    @Test
    public void testPersonListToPersonMap(){
        Map<String, Integer> truePersonMap =Map.of(
                "Richert A.", 24,
                "Rogogva O.", 39,
                "Grigoriev K.", 18,
                "Richert R.", 27
        );
        int i = 0;
        Assertions.assertAll(
                ()->Assertions.assertEquals(Map.of(), personListToPersonMap(null)),

                ()->Assertions.assertFalse(
                        personListToPersonMap(Source.personList).containsKey(""), "Есть пустые ключи"),

                ()->Assertions.assertEquals(truePersonMap.containsValue(-1),
                        personListToPersonMap(Source.personList).containsValue(-1), "Есть Person с неправильным " +
                                "значением age")

        );
        while(i<truePersonMap.size()){
            Assertions.assertEquals(truePersonMap.containsKey(Source.personList.get(i).getLastName()+" "
                            +Source.personList.get(i).getFirstName().charAt(0)),
                    personListToPersonMap(Source.personList).containsKey(Source.personList.get(i).getLastName()+" "
                            +Source.personList.get(i).getFirstName().charAt(0)),
                    "Что-то не так с элементом: "+i);
            i++;
        }


    }
}