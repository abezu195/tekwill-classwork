package md.tekwill.classwork.modifiers.nonaccess;

public class Professor /*extends Employee*/ { //Professor cannot extend from Employee since Employee is final.

    public Professor(String name) {
//        super(name); //it cannot also call its constructor since they are not related
    }
}
