package md.tekwill.datatypes.charprimitive;

public class ExampleOfCharPrimitive {

    public static void main(String[] args) {
        char foo = 'A'; // valid example
//        char bar = "A"; // invalid example
        char specialChar = '\u0110';
        System.out.println(specialChar);


//        char c1 = -122;  //won't compile
        char c1 = (char) -122;
        System.out.println("c1 = " + c1); //but doesnt show expected result
        char c2 = 122;
        System.out.println("c2 = " + c2); //z
    }
}
