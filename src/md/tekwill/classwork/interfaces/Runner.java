package md.tekwill.classwork.interfaces;

public interface Runner {
    // this won't compile, since we didn't give a default value
    //    int DEFAULT_SPEED;
//    public static final int DEFAULT_SPEED = 10; // this is same as below
    int DEFAULT_SPEED = 10; // this version is shorter, be cause we skipped redundant access and non-access modifiers!

    /* public abstract - these access and non-access modifiers can be skipped since are redundant */
    void run();

    // private modifier is not permitted in interfaces
//    private void runInADifferentWay();
}
