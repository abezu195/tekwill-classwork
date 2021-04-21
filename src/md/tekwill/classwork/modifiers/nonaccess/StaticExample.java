package md.tekwill.classwork.modifiers.nonaccess;

public class StaticExample {
    public static void main(String[] args) {
        StaticMethodAccessTest test = new StaticMethodAccessTest();
        Employee employee1 = new Employee("John");
        Employee employee2 = new Employee("Doe");
        employee1.bankVault = 300;
        employee2.bankVault = 500;
        employee1.bankVault = 700;
        Employee.bankVault = 900;
        System.out.println(employee1.bankVault);
        employee1.bankVault = 700;
        employee2.bankVault = 500;
        System.out.println("Using first reference variable of first employee, bankVault value is: " + employee1.bankVault);
        System.out.println("Using second reference variable of second employee, bankVault value is: " + employee2.bankVault);
        System.out.println("Using class name, bankVault value is: " + Employee.bankVault);


        System.out.println("X is: " + StaticMethodAccessTest.x);
    }
}
