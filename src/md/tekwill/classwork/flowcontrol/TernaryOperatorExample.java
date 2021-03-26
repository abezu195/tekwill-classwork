package md.tekwill.classwork.flowcontrol;

public class TernaryOperatorExample {

    public static void main(String[] args) {

        int bill = 2000;
        int discount = (bill > 2000) ? 15 : 10; //notice ternary operator is shorter than if
//        int discount; //same example as above, but using if
//        if (bill>2000) {
//            discount = 15;
//        }else {
//            discount = 10;
//        }'

        System.out.println("Discount is " + discount);

        int bill2 = 2000;
        int qty = 10;
        int days = 10;
//        int calculatedDays = days > 9 ? 20 : 30;
//        int calculatedQty = qty > 11 ? 10 : calculatedDays;
//        int calculatedDiscount = bill > 1000 ? calculatedQty : 10; //same as example below but a more explicit solution
        int discount2 = bill2 > 1000 ? qty > 11 ? 10 : days > 9 ? 20 : 30 : 10;
    }
}
