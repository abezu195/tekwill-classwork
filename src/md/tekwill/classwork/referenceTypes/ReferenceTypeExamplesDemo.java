package md.tekwill.classwork.referenceTypes;

public class ReferenceTypeExamplesDemo {
    public static void main(String[] args) {
        HREmployee john = new HREmployee("John", "Doe", "Staffing");
        System.out.println(john.getFirstName());
        System.out.println(john.getLastName());
        john.conductInterview();
        System.out.println("Specializations: " + john.getSpecializations());
        john.addSpecialization("Managing");
        System.out.println("Specializations: " + john.getSpecializations());

        Employee andy = new HREmployee("Andy", "Kowalski", "Staffing");
        System.out.println(andy.getFirstName());
        System.out.println(andy.getLastName());
//        These methods cannot be called using reference type Employee. Only methods above are available using this reference!
//        andy.conductInterview();
//        System.out.println("Specializations: " + andy.getSpecializations());
//        andy.addSpecialization("Managing");
//        System.out.println("Specializations: " + andy.getSpecializations());

        Interviewer bill = new HREmployee("Bill", "Kill", "Staffing");
        bill.conductInterview();
//        These methods cannot be called using reference type Interviewer. Only method above are available using this reference!
//        System.out.println(bill.getFirstName());
//        System.out.println(bill.getLastName());
//        System.out.println("Specializations: " + bill.getSpecializations());
//        bill.addSpecialization("Managing");
//        System.out.println("Specializations: " + bill.getSpecializations());


//        ManagerHR managerHR = new HREmployee("sample", "sample last name" , "");
        HREmployee managerHR = new ManagerHR("sample", "sample last name" , "", 0);
    }
}
