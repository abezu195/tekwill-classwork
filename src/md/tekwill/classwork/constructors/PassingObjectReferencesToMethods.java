package md.tekwill.classwork.constructors;

public class PassingObjectReferencesToMethods {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("GoodWillHunting");
        Person secondPerson = person;
        Person thirdPerson = new Person();
        thirdPerson.setName("Random");
        changePersonsNames(person, secondPerson, thirdPerson);
        System.out.println("First person name: " +  person.getName());
        System.out.println("Second person name: " + secondPerson.getName());
        System.out.println("Third person name: " + thirdPerson.getName());

        double sum = sum((byte) 10, 10, 10);
    }

    public static void changePersonsNames(Person... persons) {
        persons[0].setName("FirstName");
        persons[1].setName("SecondName");
        persons[2].setName("ThirdName");
    }

    public static double sum(byte arg1, int arg2, int arg3) {
        return arg1 + arg2 + arg3;
    }
}
