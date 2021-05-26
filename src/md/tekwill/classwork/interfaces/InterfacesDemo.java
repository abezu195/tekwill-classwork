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

        Runner p = new RegularPerson();
        Runner a = new Athlete();
        p.run();
        a.run();


        List<Runner> runners = new ArrayList<>();

        System.out.println(Reader.getSurname());
//        !!! CALL static methods only using interface name! THIS Doesn't even compile for interfaces!
//        Readable person = new RegularPerson();
//        person.getAuthor();

        System.out.println(RegularPerson.getSurname());
//        This is a bad practice! We don't call static methods using reference variables.
//        !!! CALL static methods only using class name!
//        RegularPerson p1 = new RegularPerson();
//        System.out.println(p1.getSurname());

        List<Reader> readers = new ArrayList<>();
        readers.add(new RegularPerson());
        readers.add(new ReadingNerdPerson());

        for (Reader reader : readers) {
            reader.read();
            reader.openBook();
        }
        System.out.println("=====================");

        MindReader mindReader = new RegularPerson();
        mindReader.read();
    }
}
