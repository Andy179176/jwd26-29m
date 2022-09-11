import java.util.List;

public class Programmer {

    String name;
    String city;
    List<String> skills;

    public Programmer(String name, String city, List<String> skills) {
        this.name = name;
        this.city = city;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return name + "( " + city + ") " +
                " skills=" + skills ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}

