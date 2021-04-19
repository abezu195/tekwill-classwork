package md.tekwill.classwork.modifiers.nonaccess;

public class StaticMethodAccessTest {
//    static int x = nonStaticMethod();  This line represent a static context, this is why everything non-static is off limits

    private static final String STRING_CONSTANT = "MY_STRING_CONSTANT";

    static {
        System.out.println("Initializing x using 3 static block");
        x = 12;
    }

    static {
        System.out.println("Initializing x using -1 static block");
        x = 40;
    }

    static {
        System.out.println("Initializing x using 2 static block");
        x = 20;
    }

    static int x;

    static {
        System.out.println("Initializing x using 1 static block");
        x = 60;
    }

    int nonStaticMethod() {
        return 20;
    }

    static int staticMethod() {
        System.out.println("Initializing x using staticMethod()");
        return 30;
    }
}
