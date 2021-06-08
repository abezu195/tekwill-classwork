package md.tekwill.classwork.enumexample;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FoodCategory[] values = FoodCategory.values();
        String types = Arrays.toString(values);
        System.out.println("Please input a food category from the available types (" + types + ")");
        String userCategory = in.nextLine();
        try {
            FoodCategory category = FoodCategory.valueOf(userCategory.toUpperCase());
            System.out.println("You have chosen the category: " + category);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println("Exiting program!");

        Product p = new Product("Sushi", FoodCategory.MEAT);

        System.out.println("FOOD: " + p.getName() + " | " + p.getCategory());
    }

    static class Product {
        private final String name;
        private final FoodCategory category;

        public Product(String name, FoodCategory category) {
            this.name = name;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public FoodCategory getCategory() {
            return category;
        }
    }
}





