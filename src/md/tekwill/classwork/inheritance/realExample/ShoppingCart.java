package md.tekwill.classwork.inheritance.realExample;

import java.time.LocalDate;
import java.util.ArrayList;

public class ShoppingCart {

    public static void main(String[] args) {
        Product sandwich = new Food("Sandwich", 10.0, LocalDate.now().plusDays(3));
        Product soup = new Food("Soup", 25.0, LocalDate.now().plusDays(1));
        Product tea = new Beverage("Tea", 8.5, LocalDate.now().plusDays(1), true);

        ArrayList<Product> products = new ArrayList<>();
        products.add(sandwich);
        products.add(tea);
        products.add(soup);

        for (Product p : products) {
            System.out.println("Product: " + p.getName() + " has price " + p.getPrice() + " lei " +
                                       " and expires in " + p.getExpirationDate() +
                                       ". The discount for this product is: " + p.getDiscount() + " lei.");
        }

        //
        Beverage lemonade = new Beverage("Tea", 8.5, LocalDate.now().plusDays(1), false);
        String isHotMessage = lemonade.isHot() ? "CAUTION, THIS IS HOT!" : "Beverage is not hot.";
        System.out.println("Beverage: " + lemonade.getName() + " has price " + lemonade.getPrice() + " lei " +
                           " and expires in " + lemonade.getExpirationDate() + ". " + isHotMessage);
    }
}
