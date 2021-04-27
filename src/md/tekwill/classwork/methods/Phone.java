package md.tekwill.classwork.methods;

import java.util.Random;

public class Phone {

    private double weight;

    //    public boolean sendSms(String phoneNumber, String message) {
//        boolean messageSent = false;
//        if (send(phoneNumber, message)) {
//            messageSent = true;
//        }
//        return messageSent;
//    }
    //does the same thing as the method above, but is much shorter!

    public boolean sendSms(String phoneNumber, String message) {
        return send(phoneNumber, message);
    }

    private boolean send(String phoneNumber, String message) {
        // does some logic that sends an SMS
        return new Random().nextBoolean();
    }
//classic set method
//    void setWeight(double val) {
//        weight = val;
//    }

//    won't compile, because of unreachable statement!
//    void setWeight(double val) {
//        return;
//        weight = val;
//    }

    void setWeight(double val) {
        if (val < 0) {
            System.out.println("returned without setting a value");
            return;
        }
        System.out.println("Weight set to " + val);
        weight = val;
//        return 200; //in a void method return must not be followed any data type
    }

//    public static void main(String[] args) {
//        Phone phone = new Phone();
//        phone.setWeight(-1.0);
//        System.out.println(phone.weight);
//        phone.setWeight(2.0);
//        System.out.println(phone.weight);
//    }

    public int getCpuCycle() {
        Random random = new Random();
        while (random.nextBoolean()) {
            if (random.nextInt(10) % 2 == 0) {
                return 123;
            }
        }
        return 0;
    }
}
