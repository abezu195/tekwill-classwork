package md.tekwill.classwork.constructors;

public class Person {
    private String name;
    int age;

    public Person() {
//        System.out.println("no-args constructor called!"); won't compile because this must be the first statement in a constructor
        this(null);
//        this(null, 0); won't compile because this must be called only one time
//        Person(null); won't compile, keyword 'this' is used to call the constructor
    }

    public Person(String newName) {
        this(newName, 25);
    }

    public Person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public Person(String newName, int newAge, boolean create) {
        this(newName, newAge);
        if (create) {
            System.out.println("Created!");
        }
    }

    public void printPerson() {
//        this("John", 25); won't work, because this can be used only inside constructor body
//        Person john = new Person("John", 25);
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public int countSumOfDays(int... days) {
        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            sum += days[i];
        }
        return sum;
    }
}
