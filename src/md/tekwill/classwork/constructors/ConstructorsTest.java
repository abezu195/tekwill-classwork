package md.tekwill.classwork.constructors;

public class ConstructorsTest {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();

//        Employee employee = new Employee("John");


        Person p1 = new Person();
        Person p2 = new Person();
        p1.setName("John");
        System.out.println(p1.getName());
        p2.setName("George");
        System.out.println("p2 name: [1]" + p2.getName());

//        String name = p1.getName();
//        p2.setName(name);  this is same as below
        p2.setName(p1.getName());
        System.out.println("p2 name: [2]" + p2.getName());

        System.out.println(p1.countSumOfDays(5, 6, 8, 9));
//        System.out.println(p1.countSumOfDays(new int[]{5, 6, 8, 9})); is same as above
    }
}
