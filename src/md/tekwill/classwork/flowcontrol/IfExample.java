package md.tekwill.classwork.flowcontrol;

public class IfExample {
    public static void main(String[] args) {
        int score = 100;
        String name = "Lion";
        if (name.equals("Lion"))
            score = 200;

        System.out.println("(Lion) score = " + score);

        if (name.equals("Tiger"))
            score = 300;

        System.out.println("(Tiger) score = " + score);

        if (name.equals("Lion"))
            score = 400;
        else
            score = 500;

        System.out.println("(Lion if-else) score = " + score);

        if (name.equals("Tiger"))
            score = 600;
        else
            score = 700;

        System.out.println("(Tiger if-else) score = " + score);

//        if (name.equals("Jaguar")) // bad example, missing if body { }, look below how to do it correctly
//            else
//            score = 700;

        if (name.equals("Jaguar")) {
        } else
            score = 700;

        if (!name.equals("Jaguar")) // same as example above, attention at '!' operator!
            score = 700;

        if (name.equals("Jaguar"))
            ;
        else
            score = 700;

    }
}
