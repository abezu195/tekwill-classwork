package md.tekwill.classwork.inheritance;

public class Manager extends Employee { // child class
    int teamSize;

    void conductMeeting() {
        System.out.println("Conducting meeting...");
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
//    this won't work since field id is marked as private in Employee class
//    public int getId() {
//        return id;
//    }
}
