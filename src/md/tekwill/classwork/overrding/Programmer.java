package md.tekwill.classwork.overrding;

class Programmer extends Employee {

    @Override
    public void reachOffice() {
        System.out.println("Reaching office by bike in Chisinau Moldova");
    }

    @Override
    public void startWorkingOnProject() {
        System.out.println("Working hard on the project!");
    }
}
