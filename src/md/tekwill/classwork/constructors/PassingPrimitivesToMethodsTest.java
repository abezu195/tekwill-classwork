package md.tekwill.classwork.constructors;

public class PassingPrimitivesToMethodsTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        int newWeight = 1000;
        System.out.println("New weight is: " + newWeight);
        phone.modifyVal(newWeight);
        System.out.println("New weight after method invocation is: " + newWeight);
    }
}
