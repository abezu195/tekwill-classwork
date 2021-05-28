package md.tekwill.classwork.thisKeyword;

public class Employee {
    String name;

    public Employee() {
        name = "Unknown";
    }

    public Employee(String name) {
        this();
        if (name != null) {
            this.name = name;
        }
    }
}
