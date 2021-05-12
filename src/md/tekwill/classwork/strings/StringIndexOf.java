package md.tekwill.classwork.strings;

public class StringIndexOf {
    public static void main(String[] args) {
        String letters = "ABCBEYAD";

        System.out.println("Index of first char in letter string: " + letters.indexOf("A"));
        System.out.println("Char that doesnt exist in our string: " + letters.indexOf('Z')); // -1
        System.out.println("Index of a group of chars that exist: " + letters.indexOf("YAD"));
        System.out.println("Index of a group of chars that don't exist: " + letters.indexOf("ZAD"));
        System.out.println("Index of a group of chars that exist: " + letters.indexOf("YAD", 6));
        System.out.println("Index of char that exists, but in uppercase: " + letters.indexOf("a".toUpperCase(), 1));

        for (int i = letters.indexOf('B') + 1; i < letters.length(); i++) {
            int b = letters.indexOf('B', i);
            if (b > -1 && b == i) {
                System.out.println(b);
            }
        }

        System.out.println();
        /* statement below is false*/
        System.out.println("a" == "а"); // even if these 'a's  look alike, they are different! The first one hass ASCII Code 97 and the second one has ASCII Code 1052 (maybe)
        /* statement below is true*/
        System.out.println("a" == "a"); // these 'a's are the same, same ASCII code (97)

    }
}
