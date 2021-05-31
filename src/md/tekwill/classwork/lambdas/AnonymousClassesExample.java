package md.tekwill.classwork.lambdas;


import md.tekwill.homeworksolutions.homework2705.Printable;
import md.tekwill.homeworksolutions.homework2705.Rectangle;

public class AnonymousClassesExample {
    public static void main(String[] args) {
        String name = "Stanislav";
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println(name);
            }
        };
        printable.print();
    }
}
