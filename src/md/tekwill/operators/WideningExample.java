package md.tekwill.operators;

public class WideningExample {
    public static void main(String[] args) {
        byte firstNumber = 50;
        byte secondNumber = 80;
//        short sum = firstNumber + secondNumber; // The result of expressions using arithmetic operators is widened to int except for double and float
        int sum = firstNumber + secondNumber; // This is acceptable
        System.out.println(sum);

        final byte thirdNumber = 27;
        final byte fourthNumber = 127;
        short anotherSum = thirdNumber + fourthNumber; // It is allowed to assign the result to another type than int if all used variables are declared final
        // But the result should be of an acceptable length, if the result is bigger than allowed in byte, we cannot assign it to a variable of type
    }
}
