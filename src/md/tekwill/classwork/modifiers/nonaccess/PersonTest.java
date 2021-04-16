package md.tekwill.classwork.modifiers.nonaccess;

public class PersonTest {
    public static void main(String[] args) {
//        Person p1 = new Person("Harry"); cannot be instanced because Person is abstract
        Employee e1 = new Employee("Harry");
        e1.displayName();
        e1.perform();
        e1.run();
    }
}
