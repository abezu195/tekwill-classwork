package md.tekwill.classwork.javaapi;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Bon");
        builder.insert(builder.length(), "soir");
        System.out.println(builder);

        // lets delete with the same index
        builder.delete(1, 1);
        System.out.println(builder);

        // lets delete with startIndex bigger than endIndex
        builder.delete(3, 1);
        System.out.println(builder);


    }
}
