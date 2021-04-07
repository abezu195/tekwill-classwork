package md.tekwill.homeworksolutions.homework0604;

public class DivisibleByFiveAndSix {
    public static void main(String[] args) {
        int number = 100;
        int end = 1000;
        int numbersPerLine = 0;

        while (number < end) {
            if (number % 5 == 0 && number % 6 == 0 /* another condition */ ) {
                System.out.print(number + " ");
                numbersPerLine++;
            }
            if (numbersPerLine == 10) {
                System.out.println();
                numbersPerLine = 0;
            }
            number++;
        }
    }
}
