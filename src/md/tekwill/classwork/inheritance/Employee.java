package md.tekwill.classwork.inheritance;

public class Employee { // parent class

    private int id;

    public String name;
    protected String facebookId;
    protected String address;
    String phoneNumber;
    protected int experience;

    void attendToMeeting() {
        System.out.println("Attending to meeting...");
    }
}
