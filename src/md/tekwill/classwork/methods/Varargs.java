package md.tekwill.classwork.methods;

public class Varargs {

    public int varargsExample(String... words) {
        for (String word : words) {
            System.out.println(word);
        }
        return 1;
    }

    public int varargsExampleWithLimitedWords(String word1, String word2) {
        System.out.println(word1);
        System.out.println(word2);
        return 1;
    }
}
