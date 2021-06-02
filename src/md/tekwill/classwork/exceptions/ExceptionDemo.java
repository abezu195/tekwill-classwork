package md.tekwill.classwork.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("somefile.name.txt");
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
        catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        String[] strings = {"aa", "bb", "c", null};
        try {
            System.out.println(strings[3].length()); // NullPointerException
        } catch (NullPointerException exception) {
            System.out.println("Attempting to access a null reference!");
        }

        try {
            System.out.println(strings[10]); //ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Attempting to access some element that doesn't exist!");
        }

//        method(); //Exception in thread "main" java.lang.StackOverflowError
    }

    public static void method() {
        System.out.println("calling my self");
        method();
    }
}
