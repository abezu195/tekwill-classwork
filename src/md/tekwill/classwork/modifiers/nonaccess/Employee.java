package md.tekwill.classwork.modifiers.nonaccess;

public final class Employee extends Person {

    public Employee(String name) {
        super(name);
    }

    public void perform() {
        System.out.println(" is performing");
    }

//    public void run() { // cannot be overriden because run method in Person is FINAL!
//        System.out.println("An employee is running very slow!");
//    }
}
