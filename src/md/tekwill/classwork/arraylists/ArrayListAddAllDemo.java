package md.tekwill.classwork.arraylists;

import java.util.ArrayList;

public class ArrayListAddAllDemo {
    public static void main(String[] args) {

        ArrayList<String> brightColors = new ArrayList<>();
        brightColors.add("yellow");
        brightColors.add("orange");

        ArrayList<String> brighterColors = new ArrayList<>();
        brighterColors.add("white");
        brighterColors.add("purple");

        brightColors.addAll(1, brighterColors);

        System.out.println(brightColors);
    }
}
