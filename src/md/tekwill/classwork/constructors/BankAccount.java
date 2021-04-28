package md.tekwill.classwork.constructors;

import java.util.Random;

public class BankAccount {
    private static final String DEFAULT_NAME = "John";
    private static final String DEFAULT_SURNAME = "Doe";
    private static final int DEFAULT_AGE = 20;

    private String name;
    private String surname;
    private int age;
    private int accountNumber;
    private String checkBook;
    private int webAccountId;

    public BankAccount() {
        name = DEFAULT_NAME;
        surname = DEFAULT_SURNAME;
        age = DEFAULT_AGE;
        System.out.println("Setting up a new account number");
        accountNumber = new Random().nextInt();
        System.out.println("New account number is: " + accountNumber);
        System.out.println("Setting up a new checkbook");
        checkBook = "CheckBook Nr" + accountNumber;
        System.out.println("New checkbook is: " + checkBook);
        System.out.println("Setting up a new web account id");
        webAccountId = accountNumber;
        System.out.println("New web account id is: " + webAccountId);
    }

    public BankAccount(String newName, String newSurname) {
        name = newName;
        surname = newSurname;
        age = DEFAULT_AGE;
        accountNumber = new Random().nextInt();
        System.out.println("New account number is: " + accountNumber);
        System.out.println("Setting up a new checkbook");
        checkBook = "CheckBook Nr" + accountNumber;
        System.out.println("New checkbook is: " + checkBook);
        System.out.println("Setting up a new web account id");
        webAccountId = accountNumber;
        System.out.println("New web account id is: " + webAccountId);
    }

    public BankAccount(String newName, String newSurname, int newAge) {
        name = newName;
        surname = newSurname;
        age = newAge;
        System.out.println("New account number is: " + accountNumber);
        System.out.println("Setting up a new checkbook");
        checkBook = "CheckBook Nr" + accountNumber;
        System.out.println("New checkbook is: " + checkBook);
        System.out.println("Setting up a new web account id");
        webAccountId = accountNumber;
        System.out.println("New web account id is: " + webAccountId);
    }
}
