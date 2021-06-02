package md.tekwill.classwork.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private int age;
    private File file;

    private final List<String> existingUserNames = new ArrayList<>();

    public User() {
        existingUserNames.add("john.doe");
        existingUserNames.add("john.wick");
        existingUserNames.add("tony.stark");
        existingUserNames.add("bruce.wayne");
    }

    public void setName(String name) throws NameTakenException { // for unchecked exceptions we can either add the 'throws' keyword
        if (name == null)
            throw new NullPointerException("Name cannot be a null value!"); // child of class RuntimeException -- UNCHECKED EXCEPTION
        if (existingUserNames.contains(name)) {
            throw new NameTakenException();
        }
        this.name = name;
    }

    public void setAge(int age) /*throws IllegalArgumentException */ { // for unchecked exceptions we can either not add the 'throws' keyword
        if (age < 0) {
//            throw new IllegalArgumentException("Age cannot be a negative number!"); // child of class RuntimeException -- UNCHECKED EXCEPTION
            throw new InvalidAgeException("Age cannot be a negative number!");
        }
        if (age > 150) {
            throw new IllegalStateException("");
        }
        this.age = age;
    }

    public void setFile(String path) throws FileNotFoundException { // for checked exception we need to add the 'throws' keyword in method signature
        File tempFile = new File(path);
        if (!tempFile.exists())
            throw new FileNotFoundException("File not existing!"); // child of class Exception -- CHECKED EXCEPTION
        file = tempFile;
    }

    public String getName() {
        return name;
    }

    public File getFile() {
        return file;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User { name = " + name + ", age = " + age + " }";
    }
}
