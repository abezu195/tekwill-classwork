package md.tekwill.classwork.object.references;

import java.util.Scanner;

public class ObjectReferenceExample {

    private Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        ObjectReferenceExample example = new ObjectReferenceExample();
        int value = example.scanner.nextInt();
        System.out.println(value);

        Scanner scanner = example.scanner;
    }
}
