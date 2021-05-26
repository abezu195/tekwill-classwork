package md.tekwill.classwork.interfaces.abstractclass;

class Manager extends Employee {

    private int teamSize;

    Manager(String name, String lastName, int teamSize) {
        super(name, lastName);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public void conductInterview() {
        System.out.println("Conducting interview with manager experience skills!");
    }
}
