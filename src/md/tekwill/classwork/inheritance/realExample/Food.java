package md.tekwill.classwork.inheritance.realExample;

import java.time.LocalDate;

public class Food extends Product {

    public static final LocalDate TOMORROW = LocalDate.now().plusDays(1);

    public Food(String newName, double newPrice, LocalDate newExpirationDate) {
        super(newName, newPrice, newExpirationDate);
    }

    @Override
    public double getDiscount() {
        return getExpirationDate().equals(TOMORROW) ? 0.5 : 0.01;
    }
}
