import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Person> individuals;

    public FamilyTree() {
        individuals = new ArrayList<>();
    }

    public void addPerson(Person person) {
        individuals.add(person);
    }

    public List<Person> findUnmarriedPersons() {
        List<Person> unmarriedPersons = new ArrayList<>();
        for (Person person : individuals) {
            if (!person.isMarried()) {
                unmarriedPersons.add(person);
            }
        }
        return unmarriedPersons;
    }

    public List<Person[]> findCouplesWithTwoChildren() {
        List<Person[]> couplesWithTwoChildren = new ArrayList<>();
        for (Person person : individuals) {
            if (person.isMarried() && person.getChildren().size() == 2) {
                Person spouse = person.getSpouse();
                if (spouse != null) {
                    Person[] couple = {person, spouse};
                    couplesWithTwoChildren.add(couple);
                }
            }
        }
        return couplesWithTwoChildren;
    }

    public List<Person> findLatestGeneration() {
        List<Person> withChildren = new ArrayList<>();
        for (Person person : individuals) {
            if (!person.getChildren().isEmpty()) {
                withChildren.add(person);
            }
        }

        List<Person> latestGeneration = new ArrayList<>();
        for (Person person : individuals) {
            if (!withChildren.contains(person)) {
                latestGeneration.add(person);
            }
        }

        return latestGeneration;
    }
}