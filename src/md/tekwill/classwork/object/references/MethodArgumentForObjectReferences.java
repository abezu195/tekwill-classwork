package md.tekwill.classwork.object.references;

import java.util.Scanner;

public class MethodArgumentForObjectReferences {

    public static void main(String[] args) {

        /* This is about how reference variables work with methods, they create a copy of given reference and use it */
        Scanner scanner = new Scanner(System.in);
        nullifyReferenceToScannerObject(scanner);
        int number = scanner.nextInt();
        System.out.println(number);

        /* This is about how we change the state of the object using the copy reference which is created when we pass a reference variable to a method */
        Animal myDog = new Animal();
        myDog.name = "Barsic";
        myDog.age = 12;
        System.out.println("Dog name: " + myDog.name + ", age: " + myDog.age);
        increaseAge(myDog);
        System.out.println("Dog name: " + myDog.name + ", age: " + myDog.age);
        increaseAgeButOnNewObject(myDog);
        System.out.println("Dog name: " + myDog.name + ", age: " + myDog.age);

        increaseANumber(number);
        System.out.println(number);
    }

    public static void nullifyReferenceToScannerObject(Scanner scanner) {
        scanner = null;
    }

    public static void increaseAge(Animal animal) {
        animal.age++;
    }

    public static void increaseAgeButOnNewObject(Animal animal) {
        animal = new Animal();
        animal.age++;
    }

    public static void increaseANumber(int number) {
        number++;
        System.out.println("Number in method: " + number);
    }
}

class Animal {
    String name;
    int age;
}
