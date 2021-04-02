package md.tekwill.classwork.flowcontrol;

import java.util.ArrayList;
import java.util.Iterator;

public class ForLoopEnhanced {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Potato");
        myList.add("Tomato");

        for (int index = 0; index < myList.size(); ++index) {
            System.out.println("my list " + index + " entry is " + myList.get(index));
        }

        for (Iterator<String> iterator = myList.iterator(); iterator.hasNext();) {
            String object = iterator.next();
            System.out.println("next element: " + object);
        }

        for (String myObject : myList) {
            System.out.println("next element: " + myObject);
        }
    }
}
