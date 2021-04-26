package md.tekwill.classwork.methods;

public class VarargsTest {
    public static void main(String[] args) {
        Varargs varargs = new Varargs();
        String[] limitedStringArray = new String[3];
        String[] newStringArray = new String[]{"Eu", "Sunt", "Bine", "Și", "Rău"};
        String word1 = "Eu", word2 = "Sunt", word3 = "Bine";
        String word4 = "Și";
        String[] wordsArray = {word1, word2, word3, word4};

        varargs.varargsExample(word1, word2, word3, word4);
        varargs.varargsExample(newStringArray);
    }
}
