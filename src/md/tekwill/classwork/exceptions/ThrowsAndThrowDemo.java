package md.tekwill.classwork.exceptions;

import java.io.FileNotFoundException;

public class ThrowsAndThrowDemo {

    public static void main(String[] args) throws FileNotFoundException {
        User user = new User();
        user.setAge(5);
        try {
            user.setName("john.doe");
        } catch (NameTakenException exception) {
            System.out.println("Name already taken, try again!");
        }
        System.out.println(user); //md.tekwill.classwork.exceptions.User@1ixhu2

//        try {
//            user.setAge(1);
//        } catch (IllegalArgumentException exception) {
//            System.out.println("Cannot set age -1 because: " + exception.getMessage());
//        } finally {
//            System.out.println("Tried to set age");
//        }
        try {
            user.setAge(-1);
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }


        try {
            user.setFile("file.txt");
        } catch (FileNotFoundException exception) {
            System.out.println("Cannot set file on user field, because: " + exception.getMessage());
        } finally {
            System.out.println("Closing the connection!");
        }
    }

}
