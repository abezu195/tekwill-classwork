package md.tekwill.homeworksolutions.homework2705;

public class SportCar implements Printable {

    private String brand;
    private int price;

    public SportCar(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }


    @Override
    public void print() {
        System.out.println("This SportCar has brand " + brand + " and price is " + price);
    }
}
