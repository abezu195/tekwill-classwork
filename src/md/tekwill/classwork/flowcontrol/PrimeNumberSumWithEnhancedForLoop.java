package md.tekwill.classwork.flowcontrol;

public class PrimeNumberSumWithEnhancedForLoop {

    public static void main(String[] args) {
        int total = 0;
        int primeNums[] = {2, 3, 7, 11};

        for (int index = 0; index < primeNums.length; ++index) {
            total += primeNums[index];
        }
        System.out.println("The total sum of given prime number is: " + total);
        total = 0;

        for (int primeNumber : primeNums) {
            total += primeNumber;
        }
        System.out.println("The total sum of given prime number is: " + total);

    }
}
