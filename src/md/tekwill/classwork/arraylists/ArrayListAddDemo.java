package md.tekwill.classwork.arraylists;

import java.util.ArrayList;

public class ArrayListAddDemo {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red"); //0
        colors.add("black"); //1
        colors.add("blue"); //2
        System.out.println(colors); // [red, black, blue]

        colors.add(1, "yellow");
        System.out.println(colors); // [red, yellow, black, blue]

        colors.add(1, "orange");
        System.out.println(colors.toString()); // [red, orange, yellow, black, blue]

//        colors.add(-1, "unknown"); //will throw an IndexOutOfBoundsException
    }
}
