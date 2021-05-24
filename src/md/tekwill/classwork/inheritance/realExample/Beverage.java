package md.tekwill.classwork.inheritance.realExample;

import java.time.LocalDate;

public class Beverage extends Product {

    private boolean hot;

    public Beverage(String newName, double newPrice, LocalDate newExpirationDate, boolean newHot) {
        super(newName, newPrice, newExpirationDate);
        hot = newHot;
    }

    public boolean isHot() {
        return hot;
    }
}
