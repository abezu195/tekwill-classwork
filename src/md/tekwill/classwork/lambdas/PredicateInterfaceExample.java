package md.tekwill.classwork.lambdas;

import md.tekwill.classwork.constructors.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceExample {

    public static void main(String[] args) {
        Predicate<String> stringPredicate = (s) -> s.startsWith("p");
        Predicate<Integer> integerPredicate = (i) -> i > 50;
        Predicate<Person> personPredicate = (p) -> p.getName().startsWith("S");

        System.out.println(stringPredicate.test("barca"));
        System.out.println(integerPredicate.test(100));
        System.out.println(personPredicate.test(new Person("Svetoslav")));

        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        strings.removeIf(s -> s.startsWith("t"));

        for (Iterator<String> stringIterator = strings.iterator(); stringIterator.hasNext();) {
            String next = stringIterator.next();
            if (next.startsWith("t")) stringIterator.remove();
        }


    }
}
