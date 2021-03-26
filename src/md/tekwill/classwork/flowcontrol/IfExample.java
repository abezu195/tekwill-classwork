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

        if (name.equals("Jaguar")) // same as example above, notice the end of statement  ';'
            ;
        else
            score = 700;

//        if (name.equals("Lion")) // bad example because of indentation
//            score = 200;
//        name = "Larry";
//        else
//            score = 300;

        boolean allow = false;

        if (allow = true) { // no syntactic error, but a logical error, be careful with = vs ==
            System.out.println("Allowed!");
        } else {
            System.out.println("Not allowed!");
        }

        int score2 = 100;
        if (score2 < 50) {
            if (score2 > 200) {
                if (score2 > 300)
                    if (score2 > 400)
                        System.out.println(1);
                    else
                        System.out.println(2);
            } else
                System.out.println(3);
        }

    }
}
