package md.tekwill.classwork.javaapi;

import md.tekwill.classwork.constructors.Person;

import java.util.ArrayList;
import java.util.List;

public class ConcatenationExample {
    public static void main(String[] args) {
        int numberOne = 20;
        int numberTwo = 15;
        String usedForConcatenation = " is not equal ";
        String result = numberOne + usedForConcatenation + numberTwo;

        // This is just a nice touch to your code, no liason to String class
        List<String> stringList = new ArrayList<>();
        boolean isNotEmpty = !stringList.isEmpty();

        System.out.println(result);

        // let's use a boolean type
        boolean isTrue = true;
        Boolean isFalse = Boolean.FALSE;
        String usedForBooleanConcatenation = " is not ";
        String booleanTypeConcatenationResult = isTrue + usedForBooleanConcatenation + isFalse;

        System.out.println(booleanTypeConcatenationResult);

        // x+=y is the same as x = x + y
        String lang = "Java";
        String language = " language";
        language += lang + language + " is everywhere";

        String isNull = null;
        String isNotNullButEmpty = "";
        System.out.println(isNull);
        System.out.println(isNotNullButEmpty);
        System.out.println("To see the difference");

        // null is also considered as a String
        String something = "Something ";
        something += null;
        System.out.println(something);

        something.equals(new Person());
        Object objectReference = something;

        // If we want to compare inequality of two String
        // !!! never do this  thisString != anotherString
        // always do this !thisString.equals(anotherString);


        String lang1 = "Jav";
        String lang2 = "Ja";


        // Concatenation does not add result value to String pool!!! Neither do the results of String class methods()!!!
        String returnValue1 = lang1 + "a";
        String returnValue2 = lang2 + "va";

        System.out.println(returnValue1 == returnValue2);


        // A long concatenation
        String longString = "a" + "b" + "c" + "d" + "e";
    }
}
