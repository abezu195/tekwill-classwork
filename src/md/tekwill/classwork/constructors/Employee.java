package md.tekwill.classwork.constructors;

public class Employee {
    //examples of initializer blocks
    {
        System.out.println("pre-init-block");
    }

    public Employee() {
        System.out.println("no-name");
    }

    public Employee(String name) {
        System.out.println(name);
    }

    //examples of initializer blocks
    {
        System.out.println("init-block");
    }

}
