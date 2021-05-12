package md.tekwill.classwork.strings;

public class StringSubstring {
    public static void main(String[] args) {
        String exam = "This is a phrase";
        String phrase = exam.substring(10);
        String substring = exam.substring(1);
        System.out.println(substring);
        String substring1 = exam.substring(2);
        System.out.println(substring1);
        String substring2 = exam.substring(3);
        System.out.println(substring2);

        System.out.println("A whole word: " + phrase);

        System.out.println("\n" + exam);

//        1.
//        System.out.println(exam.substring(10) + " " + exam.substring(12));
//
//        2.
//        String substring3 = exam.substring(10);
//        String substring4 = exam.substring(12);
//        System.out.println(substring3 + " " + substring4);

        /*Both examples 1 and 2, are doing the same thing! *.substring method returns a NEW STRING! */

        String substring3 = exam.substring(2, exam.length()); //this doesn't throw an StringIndexOutOfBoundsException and is same as exam.substring(2);
        System.out.println(substring3);

//        String substring3 = exam.substring(2, exam.length() + 1); //throws an StringIndexOutOfBoundsException
//        System.out.println(substring3);

        //"This is a phrase";
        String is = exam.substring(5, 7);
        System.out.println(is);

    }
}
