package md.tekwill.classwork.strings;

public class StringExamples {
    public static void main(String[] args) {
        String str1 = new String("Paul");
        String str2 = new String("Paul");
        System.out.println("Constructor ==" + (str1 == str2));

        String str3 = "Harry";
        String str4 = "Harry";
        System.out.println("operator = " + (str3 == str4));

        String morning1 = "Morning";
        String morning2 = new String("Morning");
        System.out.println("Equality between constructor and = operator: " + (morning1 == morning2));
    }
}
