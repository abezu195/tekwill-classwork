package md.tekwill.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Result = " + (a > 20 && b > 10));
        System.out.println("Result = " + ((a > 20) && (b > 10)));
        System.out.println("Result = " + (false && true)); // false

        System.out.println("Result = " + (a > 20 || b > 10));
        System.out.println("Result = " + ((a > 20) || (b > 10)));
        System.out.println("Result = " + (false || true)); // true

        System.out.println("Result = " + (!(b > 20)));
        System.out.println("Result = " + (!false)); // true

        System.out.println("Result = " + (!(a > 5)));
        System.out.println("Result = " + (!true)); // false


        int marks = 8;
        int total = 10;
        System.out.println("Result = " + (total < marks && (++marks > 10 && ++marks > 20)));
        System.out.println("marks = " + marks);

        int e = 10;
        int f = 20;
        int g = 40;
        System.out.println("Result = " + (e >= 99 || e <= 33 && f == 10));
        System.out.println("Result = " + (!(e >= 99) || (e <= 33 && f == 10))); // false

        int int1 = 10, int2 = 20, int3 = 30;
        System.out.println("Precedence result = " + (int1 % int2 * (int3 + int1) / int2));
        System.out.println("Precende result = " + ((int1 % int2) * ((int3 + int1) / int2)));

    }
}
