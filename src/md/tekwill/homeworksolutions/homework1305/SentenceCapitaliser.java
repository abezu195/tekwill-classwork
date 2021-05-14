package md.tekwill.homeworksolutions.homework1305;

import java.util.Scanner;

public class SentenceCapitaliser {
    //hello. my name is Joe. what is your name?
    //Hello. My name is Joe. What is your name?
    public static void main(String[] args) {
        System.out.println("Please insert the sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String capitalizedSentence = "";

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (i == 0 || (i >= 2 && isPreviousCharacterASentenceEnder(sentence, i))) {
                capitalizedSentence += Character.toUpperCase(c);
            } else {
                capitalizedSentence += c;
            }
        }

        System.out.println(capitalizedSentence);
    }

    private static boolean isPreviousCharacterASentenceEnder(String sentence, int i) {
        boolean twoCharsBehindIsEndingSentence = sentence.charAt(i - 2) == '.'
                || sentence.charAt(i - 2) == '!'
                || sentence.charAt(i - 2) == '?';
        boolean previousCharIsEndingSentence = sentence.charAt(i - 1) == '.'
                || sentence.charAt(i - 1) == '!'
                || sentence.charAt(i - 1) == '?';
        boolean previousCharIsNotLetter = !Character.isLetter(sentence.charAt(i - 1));

        return (twoCharsBehindIsEndingSentence && previousCharIsNotLetter) || previousCharIsEndingSentence;
    }
}
