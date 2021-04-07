package md.tekwill.classwork.flowcontrol.whileloop;

public class WhileExample {

    public static void main(String[] args) {
        // both examples do the same thing!
        int lastValueOfI = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("value of counter in for loop: " + i);
            lastValueOfI = i;
        }
        System.out.println("The final value of i inside for loop is " + lastValueOfI);
        System.out.println();
        int index = 0;
        while (index < 5) {
            System.out.println("value of counter in while loop: " + index);
            index++;
        }
        System.out.println("The final value of index inside while loop is " + index);


        while (true) {
            System.out.println("Some condition");
            if (index == 10) {
                break;
            }
            index++;
        }
        System.out.println("The value of index after while(true) loop: " + index);
    }
}
