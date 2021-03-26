package md.tekwill.classwork.javaapi;

import java.util.Scanner;

public class StringEqualityExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
//        Scanner scanner1 = new Scanner(System.in); // use the same scanner from above, don't recreate a new one.
//        String s2 = scanner1.nextLine();
        String sentence = "This is a foo sentence.";
        String sentenceCopy = new String("This is a foo sentence.");
        String sentenceCopySameMemory = sentence;
        String otherSentence = "This is a bar sentence.";

        boolean areSentencesEqualTheWrongWay = sentence == otherSentence; // please don't use == when comparing Strings

        // please don't use this type of comparation for Strings
//        if (sentence == otherSentence)
//            System.out.println("Equality ");
//        if (areSentencesEqualTheWrongWay)
//            System.out.println("Equality ");
//        if (areSentencesEqualTheWrongWay)
//            System.out.println("Equality 2");
//        if (areSentencesEqualTheWrongWay)
//            System.out.println("Equality 3");
//        if (areSentencesEqualTheWrongWay)
//            System.out.println("Equality 4");
//        if (areSentencesEqualTheWrongWay)
//            System.out.println("Equality 4");
//        if (areSentencesEqualTheWrongWay)
//            System.out.println("Equality ");

        boolean equalsTheRightWay = sentence.equals(otherSentence); // please use equals when comparing Strings

        System.out.println("Same object of string equality: " + (sentence == sentenceCopySameMemory)); // true
        System.out.println("Different object of string equality: " + (sentence == sentenceCopy)); // false
        System.out.println("Different object of same string equality: " + sentence.equals(sentenceCopy)); // true

        String sampleString = "fOo";

        System.out.println("sampleString.equals(\"FOO\"): " + sampleString.equals("FOO")); // false
        System.out.println("sampleString.equals(\"fOo\"): " + sampleString.equals("fOo")); //true
        System.out.println("sampleString.equalsIgnoreCase(\"FOO\") : " + sampleString.equalsIgnoreCase("FOO")); // true
        System.out.println("sampleString.toUpperCase().equals(\"FOO\"): " + sampleString.toUpperCase().equals("FOO")); // true
        System.out.println("sampleString.toLowerCase().equals(\"foo\") : " + sampleString.toLowerCase().equals("foo")); //true

        System.out.println("contains: " + sampleString.contains("O")); // true
    }
}
