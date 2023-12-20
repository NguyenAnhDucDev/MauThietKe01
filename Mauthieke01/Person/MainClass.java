import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Person james = new Person("James", "Male", "01/01/1970");
        Person hana = new Person("Hana", "Female", "02/02/1975");
        Person ryan = new Person("Ryan", "Male", "03/03/1995");
        Person kai = new Person("Kai", "Male", "04/04/2000");
        Person jennifer = new Person("Jennifer", "Female", "05/05/2005");

        james.setSpouse(hana);
        james.addChild(ryan);
        james.addChild(kai);
        kai.setSpouse(jennifer);

        familyTree.addPerson(james);
        familyTree.addPerson(hana);
        familyTree.addPerson(ryan);
        familyTree.addPerson(kai);
        familyTree.addPerson(jennifer);

        List<Person> unmarriedPersons = familyTree.findUnmarriedPersons();
        List<Person[]> couplesWithTwoChildren = familyTree.findCouplesWithTwoChildren();
        List<Person> latestGeneration = familyTree.findLatestGeneration();

        System.out.println("Unmarried Persons:");
        for (Person person : unmarriedPersons) {
            System.out.println(person.getName());
        }

        System.out.println("\nCouples with Two Children:");
        for (Person[] couple : couplesWithTwoChildren) {
            System.out.println(couple[0].getName() + " and " + couple[1].getName());
        }

        System.out.println("\nLatest Generation:");
        for (Person person : latestGeneration) {
            System.out.println(person.getName());
        }
    }
}
