package md.tekwill.homeworksolutions.homework2003;

public class BreakSequence {
    public static void main(String[] args) {
        int number = 654321;
        System.out.println("number is = " + number / 100000);
        System.out.println("first sequence of number is = " + (number / 100000) % 10);
        System.out.println("second sequence of number is = " + (number / 10000) % 10); // 12 mod 10 = 2,  12 / 10 = 1
        System.out.println("third sequence of number is = " + (number / 1000) % 10); // 123 mod 10 = 3 , 123 / 10 = 12
        System.out.println("fourth sequence of number is = " + (number / 100) % 10); // 1234 mod 10 = 4,
        System.out.println("fifth sequence of number is = " + (number / 10) % 10); // 12345 mod 10 = 5
        System.out.println("sixth sequence of number is = " + number % 10); // 123456 mod 10 = 6
    }
}
