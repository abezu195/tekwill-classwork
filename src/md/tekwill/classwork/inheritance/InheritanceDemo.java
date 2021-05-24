package md.tekwill.classwork.inheritance;

import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        Employee john = new Employee();
        john.name = "John Doe";
        john.address = "Bucharest";
        john.experience = 5;
        john.phoneNumber = "+234 567 8900";
        john.facebookId = "kbi12";
        john.attendToMeeting();

        Programmer andy = new Programmer();
        andy.name = "Andy Kowalski";
        andy.address = "Kiev";
        andy.phoneNumber = "+123 456 7843";
        andy.experience = 3;
        andy.programmingLanguages = new String[]{"Java", "JavaScript"};
        andy.facebookId = "eti14";
        andy.writeCode();
        andy.attendToMeeting();

        Manager andrew = new Manager();
        andrew.name = "Andrew Russel";
        andrew.address = "Prague";
        andrew.phoneNumber = "+313 984 7843";
        andrew.experience = 2;
        andrew.teamSize = 14;
        andrew.facebookId = "qmbi2";
        andrew.conductMeeting();
        andrew.attendToMeeting();


        HRMeeting meeting = new HRMeeting();
        meeting.inviteToMeeting(john);
        meeting.inviteToMeeting(andy);
        meeting.inviteToMeeting(andrew);


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(andy);
        employees.add(andrew);

        for (Employee e : employees) {
            System.out.println("In array list " + e.name);
        }

    }
}
