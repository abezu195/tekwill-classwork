package md.tekwill.classwork.equality;

import java.util.ArrayList;

public class ManagerEqualityDemo {
    public static void main(String[] args) {
        Manager steve = new Manager("Steve", "HR");
        Manager steveSameReference = steve;
        Manager steveOtherReference = new Manager("Steve", "HR");

        System.out.println("Equality between same 'manager' type reference: " + (steve.equals(steveSameReference))); // true
        System.out.println("Equality between different 'manager' type reference: " + (steve.equals(steveOtherReference))); // false -> true
        System.out.println("Equality between different types: " + (steve.equals(new String("Steve")))); // false

        ArrayList<Manager> managersList = new ArrayList<>();
        managersList.add(steve); // <-
        managersList.add(steveOtherReference);

        System.out.println(managersList.lastIndexOf(steve));
        System.out.println(managersList.contains(steve));
        System.out.println(managersList.indexOf(steve));

        managersList.remove(steveOtherReference);
    }
}
