package md.tekwill.classwork.interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfacesDemo {
    public static void main(String[] args) {
        RegularPerson regularPerson = new RegularPerson();
        regularPerson.run();

        Athlete athlete = new Athlete();
        athlete.run();
        athlete.dance();

        Runnable p = new RegularPerson();
        Runnable a = new Athlete();
        p.run();
        a.run();


        List<Runnable> runnables = new ArrayList<>();
    }
}
