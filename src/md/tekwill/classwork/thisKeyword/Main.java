package md.tekwill.classwork.thisKeyword;

public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.name); //null
        p.setDefaultName();
        System.out.println(p.name); // Programmer

        Employee employeeWithNullName = new Employee(null);
        System.out.println("is unknown? " + employeeWithNullName.name.equals("Unknown"));
        System.out.println(employeeWithNullName.name);
    }
}
