package md.tekwill.classwork.interfaces;

public class Athlete implements Runnable {

    @Override
    public void run() {
        System.out.println("An athlete runs fast!");
    }

    public void dance() {
        System.out.println("Dancing the winner dance!");
    }
}
