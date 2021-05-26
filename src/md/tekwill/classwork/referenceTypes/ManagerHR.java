package md.tekwill.classwork.referenceTypes;

public class ManagerHR extends HREmployee {

    private final int teamSize;

    ManagerHR(String firstName, String lastName, String specialization, int teamSize) {
        super(firstName, lastName, specialization);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
}
