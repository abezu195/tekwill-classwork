package md.tekwill.classwork.arraylists;

import java.util.ArrayList;

public class ArrayListCloneDemo {

    public static void main(String[] args) {
        ArrayList<Person> initialPersons = new ArrayList<>();
        initialPersons.add(new Person("Steve"));
        initialPersons.add(new Person("John"));

        ArrayList<Person> sameReferencePersons = initialPersons;
        ArrayList<Person> clonedInitialPersons = (ArrayList<Person>) initialPersons.clone();
        System.out.println("we are comparing the same object in memory: " + (initialPersons == sameReferencePersons)); // true,
        System.out.println("we are comparing different objects in memory: "  + (initialPersons == clonedInitialPersons)); // false,

        Person personFromInitialPersons = initialPersons.get(0);
        Person personFromClonedPersons = clonedInitialPersons.get(0);
        System.out.println("Comparing objects from different array references to same objects: "
                                   + (personFromInitialPersons == personFromClonedPersons)); // true

    }
}
