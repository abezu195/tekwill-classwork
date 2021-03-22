package md.tekwill.operators;

public class AnotherOperatorsExample {
    public static void main(String[] args) {
        int firstNumber = 14, secondNumber = 8, thirdNumber = 20;
        thirdNumber = secondNumber = firstNumber; // multiple assignments; REMEMBER! assignment goes from right to left;
        System.out.println("thirdNumber = " + thirdNumber);
    }
}
