package md.tekwill.classwork.methods.overloaded;

public class AverageCalculator {

    public static double calculate(int firstNumber, int secondNumber) {
        calculate(String.valueOf(firstNumber), String.valueOf(secondNumber));
        return (firstNumber + secondNumber) / 2.0;
    }

    public static double calculate(int intNumber, double doubleNumber) {
        calculate(String.valueOf(intNumber));
        return (intNumber + doubleNumber) / 2.0;
    }

    public static double calculate(double doubleNumber, int intNumber) {
        return ((intNumber + doubleNumber) / 2.0) + 0.01;
    }

    public static void calculate(float floatNumber1, float floatNumber2) {
        System.out.println(floatNumber1 + " " + floatNumber2);
    }

    private static void calculate(String value) {
        System.out.println(value);
    }

    protected static void calculate(String value1, String value2) {
        System.out.println(value1 + " " + value2);
    }





//    private static void handle(Car car) {
//        System.out.println("this is a car " + car);
//    }
//
//    private static void handle(Phone phone) {
//        System.out.println("this is a phone " + phone);
//    }
//
//    public static void main(String[] args) {
//        AverageCalculator.handle(new Car());
//        AverageCalculator.handle(new Phone());
//    }
}
