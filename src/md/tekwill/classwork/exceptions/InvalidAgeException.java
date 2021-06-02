package md.tekwill.classwork.exceptions;

public class InvalidAgeException extends RuntimeException { //creating an own UNCHECKED exception!

    public InvalidAgeException() {
        super();
    }

    public InvalidAgeException(String message){
        super(message);
    }
}
