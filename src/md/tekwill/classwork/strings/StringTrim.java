package md.tekwill.classwork.strings;

public class StringTrim {
    public static void main(String[] args) {

        String varWithSpaces = "     AB IS OP  ";
        System.out.println("|" + varWithSpaces + "|");

        System.out.println("|" + varWithSpaces.trim() + "|");

        //same as above, but we save the new string in trimmedVarWithSpaces variable
        String trimmedVarWithSpaces = varWithSpaces.trim();
        System.out.println("|" + trimmedVarWithSpaces + "|");

        System.out.println("|" + varWithSpaces + "|");

    }
}
