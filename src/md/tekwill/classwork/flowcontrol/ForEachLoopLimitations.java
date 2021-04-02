package md.tekwill.classwork.flowcontrol;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachLoopLimitations {
    public static void main(String[] args) {
        int[] numbers = new int[4];

        for (int i = 0; i < 4; ++i) {
            numbers[i] = i + 1;
        }

        for (int number : numbers) {
            number = 3;
        }

        System.out.println(Arrays.toString(numbers));

        ArrayList<String> exams = new ArrayList<>();
        exams.add("Java");
        exams.add("Oracle");

        String numberInString = "123";
        for (String exam : exams) {
            exam = numberInString;
        }

        for (String exam : exams) {
            System.out.println(exam);
        }

        Child firstChild = new Child("Stanislav", "Sănduță");
        Child secondChild = new Child("Alexandru", "Bezu");

        ArrayList<Child> children = new ArrayList<>();
        children.add(firstChild);
        children.add(secondChild);

        for (Child child : children) {
            Child thirdChild = new Child("Ion", "Pascari");
            child.surname = "Another name";
            child = thirdChild;
        }

        children.remove(firstChild);

        for (Child child : children) {
            System.out.println(child.name + " " + child.surname);
        }

        String names[] = new String[]{"James", "Ion", "Gheorghe"};

        for (int index = 0; index < numbers.length && index < names.length; ++index) {
            System.out.println("number: " + numbers[index]);
            System.out.println("name: " + names[index]);
        }

        for (int numberIndex = 0, namesIndex = 0; numberIndex < numbers.length && namesIndex < names.length; ++namesIndex, ++numberIndex) {
            System.out.println("number: " + numbers[numberIndex]);
            System.out.println("name: " + names[namesIndex]);
        }
    }
}


class Child {
    String name;
    String surname;

    Child(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


}