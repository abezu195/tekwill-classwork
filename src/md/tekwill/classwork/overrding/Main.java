package md.tekwill.classwork.overrding;

public class Main {
    public static void main(String[] args) {
        Employee programmer = new Programmer();
        Employee manager = new Manager();

        programmer.reachOffice();
        manager.reachOffice();

        programmer.startWorkingOnProject();
        manager.startWorkingOnProject();
    }
}
