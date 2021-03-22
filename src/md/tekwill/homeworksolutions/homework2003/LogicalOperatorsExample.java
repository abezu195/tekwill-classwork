package md.tekwill.homeworksolutions.homework2003;

public class LogicalOperatorsExample {

    public static void main(String[] args) {
        int a = 18;
        int b = 22;
        int c = 30;
        System.out.println(++a > 18 || b++ < 10);
        System.out.println("1. a = " + a + ", b = " + b);
        System.out.println(b-- > 30 && a++ <= 19);
        System.out.println("2. b = " + b + ", a = " + a);
        System.out.println(c++ > a && a < b || c++ < 30);
        System.out.println("3. c = " + c /* 31 */ + ", a = " + a + ", b = " + b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}
