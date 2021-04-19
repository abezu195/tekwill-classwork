package md.tekwill.classwork.modifiers.nonaccess;

public final class Employee extends Person {
    private static final int MIN_AGE = 20;
    private static final int MAX_AGE = 80;

    static int bankVault;
    static String bankVaultName = "EMPLOYEE_VAULT";

    public static String getBankVaultName() {
        return bankVaultName;
    }

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
