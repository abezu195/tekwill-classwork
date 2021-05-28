package md.tekwill.homeworksolutions.homework2705;

public class Manager implements Printable {

    private String name;
    private int age;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("This manager has name " + name + " and age " + age);
    }
}
