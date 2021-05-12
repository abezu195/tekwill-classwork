package md.tekwill.classwork.encapsulation;

public class Computer {

    private String brand;
    private int ramSize;
    private boolean started;

    public Computer(String newBrand, int newRamSize, boolean newStarted) {
        brand = newBrand;
        ramSize = newRamSize;
        started = newStarted;
    }

    public String getBrand() {
        return this.brand;
    }
//
//    public void setBrand(String newBrand) {
//        brand = newBrand;
//    }

    public int getRamSize() {
        return ramSize;
    }

    public boolean isStarted() {
        return started;
    }

//    public void setRamSize(int ramSize) {
//        this.ramSize = ramSize;
//    }
//
//    public void setStarted(boolean started) {
//        this.started = started;
//    }
}
