package md.tekwill.classwork.interfaces;

public class RegularPerson implements Runnable, Readable /* a class can implement multiple interfaces*/ {

    @Override
    public void run() {
        System.out.println("A regular person is running with normal speed!");
    }

    @Override
    public void read() {
        System.out.println("A regular person is reading with normal speed!");
    }

    @Override
    public void openBook() {
        System.out.println("Opening a random book!");
    }
}
