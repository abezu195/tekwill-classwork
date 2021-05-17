package md.tekwill.classwork.arraylists;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.function.Predicate;

public class ArrayListAccessDemo {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("black");
        colors.add("blue");

        for (String color : colors) {
            System.out.println(color);
        }

        ListIterator<String> iterator = colors.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }


//        for (String color : colors) {
//            colors.remove(color); // ConcurrentModificationException
//       }
//        for (String color : colors) {
//            if (color.equals("red")) {
//                colors.remove(color); // ConcurrentModificationException
//            }
//        }

        ListIterator<String> colorListIterator = colors.listIterator();
        while (colorListIterator.hasNext()) {
            String color = colorListIterator.next();
            if (color.equals("red")) {
                colorListIterator.remove();
            }
        }

        System.out.println(colors);
    }
}