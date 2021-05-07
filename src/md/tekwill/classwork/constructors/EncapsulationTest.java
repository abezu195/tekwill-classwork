package md.tekwill.classwork.constructors;

import java.util.Scanner;

public class EncapsulationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("Alex");

//        System.out.print("Please, give the age of the Alex: ");
//        int newAge = scanner.nextInt();

        // We cannot do this since age is private due to encapsulation
//        if (newAge <= 0) {
//            System.out.println("The age cannot be lower or equal with 0");
//        }
//        else {
//            person.age = newAge;
//        }

        Phone phone = new Phone();
        phone.setWeight(-12.23);
        System.out.println(phone.getWeight());
        phone.setWeight(12.23);
        System.out.println(phone.getWeight());

        phone.setModel("Galaxy");
        System.out.println(phone.getModel());
        phone.setCompany("Samsung");
        System.out.println(phone.getCompany());

        phone.setModel("BLJASKDJKASJKDasm");
        System.out.println(phone.getModel());

    }
}
