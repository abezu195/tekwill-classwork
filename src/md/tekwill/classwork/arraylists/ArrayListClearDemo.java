package md.tekwill.classwork.arraylists;

import java.util.ArrayList;

public class ArrayListClearDemo {
    public static void main(String[] args) {
        ArrayList<String> brightColors = new ArrayList<>();
        brightColors.add("yellow");
        brightColors.add("orange");
        System.out.println("Colors before clear " + brightColors);
        brightColors.clear();
        System.out.println("Colors after clear " + brightColors);
    }
}
