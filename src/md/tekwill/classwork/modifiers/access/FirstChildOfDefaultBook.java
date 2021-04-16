package md.tekwill.classwork.modifiers.access;

public class FirstChildOfDefaultBook extends DefaultBook {

    public FirstChildOfDefaultBook() {
        issueCount = 1;
        issueHistory();
//        type = "newType";
//        displayType();
    }

    private FirstChildOfDefaultBook(int i) {
        System.out.println(i);
    }
}
