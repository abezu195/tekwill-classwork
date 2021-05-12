package md.tekwill.classwork.encapsulation;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo", 8, true);
        System.out.println(computer.getBrand()); // null
        System.out.println(computer.isStarted()); // false
        System.out.println(computer.getRamSize()); // 0

        if (computer.getBrand() != null) {
            System.out.println(computer.getBrand().equals("other-brand"));
        }

//        computer.setBrand("Lenovo");
//        computer.setRamSize(8);
//        computer.setStarted(true);

        System.out.println(computer.getBrand());
        System.out.println(computer.getRamSize());
        System.out.println(computer.isStarted());

        if (computer.getBrand() != null) {
            System.out.println("Is other brand: " + computer.getBrand().equals("other-brand"));
            System.out.println("Is Lenovo: " + computer.getBrand().equals("Lenovo"));
        }
    }
}
