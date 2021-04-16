package md.tekwill.classwork.modifiers.access;

public class Librarian {

    Librarian() {
        ProtectedBook protectedBook = new ProtectedBook();
        protectedBook.author = "CBD";
        protectedBook.modifyTemplate();

        DefaultBook defaultBook = new DefaultBook();
        defaultBook.issueCount = 1;
        defaultBook.issueHistory();
    }
}
