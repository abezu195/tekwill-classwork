package md.tekwill.homeworksolutions.homework2705;

public class Rectangle implements Printable {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("This rectangle has width " + width + " and height " + height);
    }
}
