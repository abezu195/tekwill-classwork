package md.tekwill.classwork.strings;

public class StringStarsEndsWith {
    public static void main(String[] args) {

        String letters = "ABCDEAS";

        System.out.println(letters.startsWith("AB")); // true
        System.out.println(letters.startsWith("BA")); // false

        System.out.println(letters.startsWith("AB", 2)); // false
        System.out.println(letters.startsWith("AB", letters.length() + 1)); // false

        System.out.println(letters.endsWith("AS")); // true
        System.out.println(letters.endsWith("ZBCDEAS")); // false
        System.out.println(letters.endsWith("ABCDEASYYY")); // false

//        System.out.println(letters.charAt(letters.length() - 1));
    }
}
