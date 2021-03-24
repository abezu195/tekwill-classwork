package md.tekwill.classwork.streams;

public class EscapeCharactersExample {
    public static void main(String[] args) {
        String myFavoriteBook = "My favorite book is \"Fight Club\" by Chuck Palahniuk";
        System.out.println(myFavoriteBook);

        String workFiles = "D:\\WorkProjects\\Java";
        System.out.println(workFiles);

        System.out.print("I am walking through the woods,\nI am walking alone\n");
        System.out.println("I am walking through the woods,");
        System.out.println("I am walking alone");

        System.out.println("\"Escaping characters\", \u00A9 2019 CodeGym");

        System.out.println("\u004d\u0061\u006f \u005a\u0065\u0064\u006f\u006e\u0067 " +

                "\u0028\u0054\u0072\u0061\u0064\u0069\u0074\u0069\u006f\u006e\u0061\u006c " +

                "\u0043\u0068\u0069\u006e\u0065\u0073\u0065\u003a \u6bdb\u6fa4\u6771\u002c " +

                "\u0053\u0069\u006d\u0070\u006c\u0069\u0066\u0069\u0065\u0064 " +

                "\u0043\u0068\u0069\u006e\u0065\u0073\u0065\u003a \u6bdb\u6cfd\u4e1c\u002c " +

                "\u0050\u0069\u006e\u0079\u0069\u006e\u003a \u004d\u00e1\u006f " +

                "\u005a\u00e9\u0064\u014d\u006e\u0067\u0029 \u0077\u0061\u0073 \u0061 " +

                "\u0032\u0030\u0074\u0068\u002d\u0063\u0065\u006e\u0074\u0075\u0072\u0079 " +

                "\u0043\u0068\u0069\u006e\u0065\u0073\u0065 " +

                "\u0073\u0074\u0061\u0074\u0065\u0073\u006d\u0061\u006e\u002c " +

                "\u0070\u006f\u006c\u0069\u0074\u0069\u0063\u0069\u0061\u006e\u002c " +

                "\u0061\u006e\u0064 \u0074\u0068\u0065 \u0063\u0068\u0069\u0065\u0066 " +

                "\u0074\u0068\u0065\u006f\u0072\u0065\u0074\u0069\u0063\u0069\u0061\u006e " +

                "\u006f\u0066 \u004d\u0061\u006f\u0069\u0073\u006d\u002e");
    }
}
