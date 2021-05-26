package md.tekwill.classwork.interfaces;

public class ReadingNerdPerson implements Reader {

    @Override
    public void read() {
        System.out.println("A reading nerd person is reading very fast...");
    }

    @Override
    public void openBook() {
        System.out.println("A nerd doesn't open a single book! He opens two books at a time!");
    }
}
