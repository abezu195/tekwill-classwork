package md.tekwill.classwork.wrappers;

public class WrappingWithValueOf {
    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf(14);
        Integer integer2 = Integer.valueOf("14");
        System.out.println(integer1 == integer2);

        Integer integer3 = new Integer(14);
        Integer integer4 = Integer.valueOf("14");
        System.out.println(integer3 == integer4);
    }
}
