package md.tekwill.operators;

public class DivisionExample {
    public static void main(String[] args) {
        int result;
        result = 10 / 6;
        System.out.println("result = " + result);

        // Using double or float literal values for division will give double or float data type result
        // result = 10.0F / 6.0F; = float
        // result = 10.0 / 6.0 = double

        int remainderResult;
        remainderResult = 10 % 6;
        System.out.println("remainderResult = " + remainderResult);

        // Using double or float literal values for modulus operation will give double or float data type result
        // remainderResult = 10.0 % 6.0;
        // remainderResult = 10.0F % 6.0F;
    }
}
