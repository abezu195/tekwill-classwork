package md.tekwill.classwork.modifiers;

import md.tekwill.classwork.modifiers.access.DefaultBook;

public class SecondChildOfDefaultBook extends DefaultBook {

    public SecondChildOfDefaultBook() {
//        issueCount = 1;
//        issueHistory();
        // Cannot be accessed in an outside package when properties are declared as default/package-private
    }
}
