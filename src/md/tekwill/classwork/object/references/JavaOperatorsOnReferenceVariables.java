package md.tekwill.classwork.object.references;

import java.util.Scanner;

public class JavaOperatorsOnReferenceVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        scanner++; unary operators can't be applied to reference variables

        Object object = new String();

//        if (object > scanner); We can't use relational operations on reference variables

//        object += scanner; We can't use arithmetic operations on reference variables
//        object -= scanner;
//        object *= scanner;
    }
}
