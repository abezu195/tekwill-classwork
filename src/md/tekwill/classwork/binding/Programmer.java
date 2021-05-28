package md.tekwill.classwork.binding;

class Programmer extends Employee {
    String name = "Programmer";

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
