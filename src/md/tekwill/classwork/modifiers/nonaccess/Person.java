package md.tekwill.classwork.modifiers.nonaccess;

public /*final*/ abstract class Person { //final cannot be used in pair with abstract
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.print(name);
    }

//    public abstract void perform(){ //abstract methods cannot have a body at all
//
//    };

    public abstract void perform();

    public final void run() {
        System.out.println(name + " is running!");
    }
}
