package md.tekwill.classwork.strings;

public class StringChartAt {
    public static void main(String[] args) {
        String name = "Harry";

        System.out.println("Index 0 is " + name.charAt(0));

        System.out.println("Length of name is: " + name.length());

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

//        int lengthOfName = name.length();
//        System.out.println(name.charAt(lengthOfName)); // throws StringIndexOutOfBoundsException
    }
}
