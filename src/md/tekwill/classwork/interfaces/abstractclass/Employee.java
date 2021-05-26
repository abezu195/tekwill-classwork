package md.tekwill.classwork.interfaces.abstractclass;

abstract class Employee implements Interviewer {

    private final String name;
    private final String lastName;

    protected Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void conductInterview() {
        System.out.println("Conducting interview in a general way!");
    }
}
