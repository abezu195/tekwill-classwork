package md.tekwill.classwork.object.references;

public class DeterminationOfEquality {
    public static void main(String[] args) {
        String firstString = new String("firstString");
        String secondString = new String("firstString");

        secondString = firstString;

        System.out.println("Determination of equality of two Strings with == : " + (firstString == secondString));
        System.out.println("Determination of equality of two Strings with equals() : " + firstString.equals(secondString));
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int numberOfMembers;
}
