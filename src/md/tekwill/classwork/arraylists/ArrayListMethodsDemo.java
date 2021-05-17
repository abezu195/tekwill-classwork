package md.tekwill.classwork.arraylists;

import java.util.ArrayList;

public class ArrayListMethodsDemo {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("yellow");
        colors.add("orange");
        colors.add("white");
        colors.add("purple");
        colors.add("white");

        System.out.println(colors.get(0)); // inline, same as below but different index

        String colorWithIndexOne = colors.get(1);
        System.out.println(colorWithIndexOne);

        int size = colors.size();
        System.out.println("We currently have " + size + " colors in the array list");

//        System.out.println("some string".equals("some string")); // return true
        if (colors.contains("white")) {
            System.out.println("Hurray! We have the white color in our array list of elements!");
        }
        System.out.println("Does this array contain white color? " + colors.contains("white")); // true
        System.out.println("Does this array contain black color? " + colors.contains("black")); // false

        int indexOfWhite = colors.indexOf("white");
        System.out.println("Index of color white is " + indexOfWhite); //2
        System.out.println("Index of color black is " + colors.indexOf("black")); //-1

        System.out.println(colors);
        System.out.println("Last index of color white is " + colors.lastIndexOf("white")); //4

    }
}
