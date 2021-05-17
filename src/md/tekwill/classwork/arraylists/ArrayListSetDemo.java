package md.tekwill.classwork.arraylists;

import java.util.ArrayList;

public class ArrayListSetDemo {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("black");
        colors.add("blue");
        System.out.println(colors);

        colors.set(1, "aqua");
        System.out.println(colors);


        ArrayList<StringBuilder> stringBuilderNumbers = new ArrayList<>();
        stringBuilderNumbers.add(new StringBuilder("first"));
        stringBuilderNumbers.add(new StringBuilder("second"));
        stringBuilderNumbers.add(new StringBuilder("third"));

        for (StringBuilder number : stringBuilderNumbers) {
            number.append(number.length());
            System.out.println(number.toString());
        }
    }
}
