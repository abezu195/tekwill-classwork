package md.tekwill.classwork.wrappers;

public class ComparingWrapperClasses {
    public static void main(String[] args) {
        Integer int1 = 100;
        Short short1 = 100;
        Boolean boolean1 = true;

        System.out.println("Comparing by equals() method: " + int1.equals(short1));
//        System.out.println("Comparing by == method: " + (int1 == boolean1)); We cannot compare using operator == object references of different types
    }
}
