package md.tekwill.classwork.interfaces;

public interface Runnable {
    int DEFAULT_SPEED = 10;

    void run();

    // private modifier is not permitted in interfaces
//    private void runInADifferentWay();
}
