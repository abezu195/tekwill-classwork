package md.tekwill.classwork.interfaces;

public class Athlete implements Runner {

    @Override
    public void run() {
        System.out.println("An athlete runs fast!");
    }

    public void dance() {
        System.out.println("Dancing the winner dance!");
    }
}
