package md.tekwill.classwork.strings;

public class StringReplace {
    public static void main(String[] args) {
        String letters = "ABCEDZEDZG";
        String lettersWithMinusInsteadOfE = letters.replace('E', '-');
        System.out.println(letters);
        System.out.println(lettersWithMinusInsteadOfE);

        String letterWithUnderscoresInsteadOfDZ = letters.replace("DZ", "______");
        System.out.println(letters);
        System.out.println(letterWithUnderscoresInsteadOfDZ);

//        Won't compile, because we need to be consistent with the param types!
//        letters.replace("DZ", '-'); -> String - char
//        letters.replace('D', "SOME_STRING"); -> char -> String

        //Replace only the first 'E' to make it lowercase
        int indexOfFirstE = letters.indexOf('E');
        String newLetters = "";
        for (int i = 0; i < letters.length(); i++) {
            if (i == indexOfFirstE) {
                newLetters += Character.toLowerCase(letters.charAt(i)); // same as: new String(new char[]{letters.charAt(i)}).toLowerCase(); //"E".toLowerCase();
            } else {
                newLetters += letters.charAt(i);
            }
        }
        System.out.println(newLetters);
        System.out.println(letters);
    }
}
