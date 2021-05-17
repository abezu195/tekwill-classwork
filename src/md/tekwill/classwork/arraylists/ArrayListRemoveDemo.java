package md.tekwill.classwork.arraylists;

import java.util.ArrayList;

public class ArrayListRemoveDemo {
    public static void main(String[] args) {
        ArrayList<StringBuilder> order = new ArrayList<>();
        StringBuilder first = new StringBuilder("first");
        StringBuilder second = new StringBuilder("second");
        StringBuilder third = new StringBuilder("third");
        StringBuilder fourth = new StringBuilder("fourth");
        order.add(first); // 0
        order.add(second); // 1
        order.add(third); // 2
        order.add(fourth); //3
        System.out.println(order);

        System.out.println("remove second element by index: " + order.remove(1)); // THE OBJECT ITSELF
        System.out.println(order);

//        System.out.println("remove element with un-existing index: " + order.remove(8)); //java.lang.IndexOutOfBoundsException
//        System.out.println(order);

        System.out.println("remove third element by reference: " + order.remove(third)); //true
        System.out.println(order);

        System.out.println("trying to remove fourth element by other reference: "
                           + order.remove(new StringBuilder("fourth"))); // false
        System.out.println(order);

        // these objects are not equal, because their reference is different!
        System.out.println(new StringBuilder("1").equals(new StringBuilder("1")));

        System.out.println("-=================================");
        System.out.println(new Person("Steve").equals(new Person("Alex"))); // false
        System.out.println(new Person("Steve").equals(new Person("Steve"))); // true
        System.out.println("-=================================");


        ArrayList<Person> persons = new ArrayList<>();
        Person steve = new Person("Steve");
        Person alex = new Person("Alex");
        Person john = new Person("John");
        Person alice = new Person("Alice");
        persons.add(steve); // 0
        persons.add(alex);
        persons.add(john);
        persons.add(alice);
        for(Person person : persons) {
            System.out.println(person.getName());
        }
        persons.remove(0);
        persons.remove(alex);
        System.out.println("-=================================");
        for(Person person : persons) {
            System.out.println(person.getName());
        }

        persons.remove(new Person("Alice"));
        System.out.println("-=================================");
        for(Person person : persons) {
            System.out.println(person.getName());
        }

    }
}
