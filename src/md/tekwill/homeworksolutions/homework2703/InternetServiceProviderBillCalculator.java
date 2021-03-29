package md.tekwill.homeworksolutions.homework2703;

import java.util.Scanner;

public class InternetServiceProviderBillCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the package from known packages (A, B or C): ");
        String userPackage = in.nextLine();
        System.out.println("Please enter the amount of hours that were used: ");
        float userNumberOfHours = in.nextFloat();
        float billPrice = 0;

        if (userNumberOfHours > 0) {
            if (userPackage.equalsIgnoreCase("A")) {
                billPrice = userNumberOfHours <= 10
                        ? 9.95F
                        : 9.95F + ((userNumberOfHours - 10) * 2);
            }/* add condition when userPackage equals "B */ else if (userPackage.equalsIgnoreCase("C")) {
                billPrice = 19.95F;
            }
        }

        if (billPrice > 0) {
            System.out.println("Total charges for package you chose " + userPackage + " is: " + billPrice);
        } else {
            System.out.println("You must provide a positive number of hours or a valid internet package");
        }
    }
}
