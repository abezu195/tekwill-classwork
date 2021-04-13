package md.tekwill.classwork.object.references;

public class GarbageCollection {
    public static void main(String[] args) {
        String s1 = new String("something");
        String s2 = s1;
        String s3 = s2;

        s2 = null;
        s3 = null;
        s1 = new String("anotherSomething");
        System.out.println(s1);
    }

    /* At which line does the garbage collector remove from heap memory String "something"? */
}
