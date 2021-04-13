package md.tekwill.classwork.wrappers;


public class WrappingByConstructor {
    public static void main(String[] args) {
        Byte byte1 = new Byte((byte)10);
        Double double1 = new Double(10.98);
        Double double2 = new Double(10.98F);

        Double double3 = new Double("10.98");

        Character c1 = new Character('a');

        Boolean boolean1 = Boolean.valueOf(false);

        Boolean boolean2 = Boolean.valueOf("false");

        boolean2.booleanValue();

        boolean boolean3 = Boolean.parseBoolean("this is some gibberish");
        System.out.println(boolean3);

    }
}
