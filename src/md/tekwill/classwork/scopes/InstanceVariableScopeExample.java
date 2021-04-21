package md.tekwill.classwork.scopes;

public class InstanceVariableScopeExample {

//    private static int staticNum = num; This is a class scope, not an instance variable scope, thus, num's value cannot be used to set staticNum's value

    private int num;

    public int increment() {
        int newValue;
        newValue = ++num;
        num--;
        return newValue;
    }

    public int decrement() {
        int newValue;
        newValue = --num;
        num++;
        return newValue;
    }
}
