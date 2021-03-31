package md.tekwill.classwork.flowcontrol;

public class ForLoopSimpleExample {
    public static void main(String[] args) {
        int firstCounter = 0;
        System.out.println("Current first count: " + firstCounter++);
        System.out.println("Current first count: " + firstCounter++);
        System.out.println("Current first count: " + firstCounter++);
        System.out.println("Current first count: " + firstCounter++);
        System.out.println("Current first count: " + firstCounter++);
        System.out.println("Current first count: " + firstCounter++);
        System.out.println("Current first count: " + firstCounter++);
        for (int counter = 0; counter < 10; counter++) {
            sendEmail(counter);
        }

//        int i = 0; If we have the same name variable in for loop as a variable before it, the compiler will give an error
        int a = 5, b = 18, c = 22;
        for (int i = 0; i < 5; ++i, a = a - 1, b++, --c) {
            System.out.println(a + ":" + b + ":" + c);
        }

        // An example of infinite for loop
//        for (int i = 0; ; i++) {
//            System.out.println(i);
//        }

        // Another example of an infinite for loop
//        for (int i = 0; true; ++i) {
//            System.out.println(i);
//        }

        for (int counter = 0; counter < 5; sayItsMorning(), sendEmail(counter), ++counter) {
            sayWakeUp();
        }

        // Yet another for infinite for loop example
//        for (int counter = 0; counter < 5; ) {
//            sayWakeUp();
//        }

        // You can nest as many for loops as you want
//        for (;;) {
//            for (;;) {
//                for (;;) {
//                    for (;;) {
//
//                    }
//                }
//            }
//        }
    }

    private static void sayWakeUp() {
        System.out.println("Wake up");
    }

    private static void sayItsMorning() {
        System.out.println("Good morning");
    }

    public static void sendEmail(int counter) {
        System.out.println("Sending email number " + (counter + 1) + "...");
        System.out.println("Email sent...");
    }
}
