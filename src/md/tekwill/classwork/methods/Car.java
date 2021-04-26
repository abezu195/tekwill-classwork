package md.tekwill.classwork.methods;

public class Car {


    public boolean start() {
        if (ignite() == true) {
            return true;
        }
        return false;
    }

    /* The number of parameters is unlimited, though it is recommended to use as few as possible */
    public void testMethod(String s1, String s2, String s3, String s4, String s5) {

    }

    private boolean ignite() {
        return true;
    }
}
