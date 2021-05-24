package md.tekwill.classwork.inheritance;

public class Programmer extends Employee /*, Manager - a class cannot extend multiple classes!!!!  */ { //child class
    String[] programmingLanguages;

    void writeCode() {
        System.out.println("Writing code...");
    }
}
