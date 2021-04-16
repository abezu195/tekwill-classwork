package md.tekwill.classwork.modifiers;

import md.tekwill.classwork.modifiers.access.Book;
import md.tekwill.classwork.modifiers.access.DefaultBook;
import md.tekwill.classwork.modifiers.access.FirstChildProtectedBook;
import md.tekwill.classwork.modifiers.access.ProtectedBook;

public class House {
    House() {
        Book book = new Book();
        String isbn = book.isbn;
        book.printBook();

        ProtectedBook protectedBook = new ProtectedBook();
//        protectedBook.author; // Will not compile, because of protected access
        FirstChildProtectedBook firstChildProtectedBook = new FirstChildProtectedBook();
//        firstChildProtectedBook.author // Will not compile, because of protected access
        SecondChildProtectedBook secondChildProtectedBook = new SecondChildProtectedBook();
        DefaultBook defaultBook = new DefaultBook();
//        defaultBook.issueCount; // Package-private access, cannot be accessed by outside package
    }
}
