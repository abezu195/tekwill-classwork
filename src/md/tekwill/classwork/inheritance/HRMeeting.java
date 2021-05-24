package md.tekwill.classwork.inheritance;

public class HRMeeting {

    public void inviteToMeeting(Employee employee) {
        System.out.println("Invited " + employee.name + " to a meeting via phone " + employee.phoneNumber);
    }
}
