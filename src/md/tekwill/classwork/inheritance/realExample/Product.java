package md.tekwill.classwork.inheritance.realExample;

import java.time.LocalDate;

public abstract class Product {

    private String name;
    private double price;
    private LocalDate expirationDate;
    private double discount;

    public Product(String newName, double newPrice, LocalDate newExpirationDate) {
        name = newName;
        price = newPrice;
        expirationDate = newExpirationDate;
        discount = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public double getDiscount() {
        return discount;
    }
}
