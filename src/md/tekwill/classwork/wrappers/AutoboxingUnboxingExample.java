package md.tekwill.classwork.wrappers;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        int integerPrimitive = 100;
        Integer int1 = 100;
        Integer int2 = integerPrimitive;

        int primitiveFromWrapper = int2;

        Double d1 = Double.valueOf(12.67);
        d1 = new Double(12.68);
        System.out.println(d1.compareTo(21.68));

        double[] doublePrimitiveArray = new double[2];
        Double[] doubleArray = new Double[2];
        doubleArray[0] = 12.12;
        doubleArray[1] = 11.24;
        Double total = 0.0;
        for (Double element : doubleArray) {
            double var1 = total.doubleValue() + element.doubleValue();
            total += element;
            // This is the equivalent of total += element, but after autoboxing/unboxing is applied
        }

        System.out.println("Total: " + total);

        doubleUnboxing(total);
        doubleUnboxing(12.12);
    }

    public static double doubleUnboxing(Double obj) {
        return obj.doubleValue();
    }

    public static int increment(Integer obj) {
        // return ++obj.intValue();
        return ++obj;
    }
}
