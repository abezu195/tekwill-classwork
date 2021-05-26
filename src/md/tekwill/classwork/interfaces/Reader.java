package md.tekwill.classwork.interfaces;

public interface Reader {
    void read();

    static String getSurname() {
        return "James Gold";
    }

    default void openBook() {
        System.out.println("Opening a random book!");
    }
}
