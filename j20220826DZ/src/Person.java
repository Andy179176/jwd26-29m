import java.time.LocalDate;

public class Person {
    private final String name;
    private final String surName;
    private final int birthYear;

    public Person(String name, String surName, int birthYear) {
        this.name = name;
        this.surName = surName;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    private boolean checkValidity() {
        LocalDate date = LocalDate.of(2022, 12, 31);
        return date.getYear() - birthYear <= 10;
    }

    public class Passport {
        private final int passNum;
        private final String country;

        public Passport(int passNum, String country) {
            this.passNum = passNum;
            this.country = country;
        }

        @Override
        public String toString() {
            return Person.this.name + " " +Person.this.surName + ", passNum=" + passNum + ", country='" + country;
        }

        public boolean checkValidity() {
            LocalDate date = LocalDate.of(2022, 12, 31);
            return date.getYear() - Person.this.birthYear <= 120;
        }
    }

}
