package md.tekwill.classwork.modifiers.nonaccess;

public class StaticMethodExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John");
        Employee employee2 = new Employee("Doe");

        employee1.bankVaultName = "EMPLOYEE1_VAULT";
        employee2.bankVaultName = "EMPLOYEE2_VAULT";
        Employee.bankVaultName = "EMPLOYEE_RENAMED_VAULT";

        System.out.println(employee1.getBankVaultName());
        System.out.println(employee2.getBankVaultName());
        System.out.println(Employee.getBankVaultName());
    }
}
