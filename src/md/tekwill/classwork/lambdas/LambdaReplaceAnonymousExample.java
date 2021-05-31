package md.tekwill.classwork.lambdas;

import md.tekwill.homeworksolutions.homework2705.Printable;

public class LambdaReplaceAnonymousExample {
    public static void main(String[] args) {
        String name = "Alexandru";
        Printable printable = () -> { System.out.println("Hello" + name); };
        printable.print();
    }
}
