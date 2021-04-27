package md.tekwill.classwork.methods;

import md.tekwill.classwork.methods.overloaded.AverageCalculator;

public class OverloadedMethodsUser {

    public static void main(String[] args) {
        System.out.println("Calculate int, int " + AverageCalculator.calculate(1, 3));
        System.out.println("Calculate int, double " + AverageCalculator.calculate(1, 3.0));
        System.out.println("Calculate double, int " + AverageCalculator.calculate(3.0, 1));
//        AverageCalculator.calculate(3.0f, 1.0f);
        AverageCalculator.calculate(1, 3);
    }
}
