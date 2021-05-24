package md.tekwill.classwork.inheritance.inheritanceDemo;

public class InheritanceDemoOtherPackage {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setName("Dr. House");
        System.out.println(doctor.getName());
        System.out.println(doctor.name);
    }
}
