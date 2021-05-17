package md.tekwill.classwork.arraylists;

import java.util.ArrayList;

public class ArrayListInitialisationDemo {
    public static void main(String[] args) {
        String[] arrayOfStrings = new String[10];
//        this declaration of array is same as below, but longer! see the diamond operator on the right!
//        ArrayList<String> arrayListOfStrings = new ArrayList<String>();

//        will throw an java.lang.IllegalArgumentException, because capacity is negative!
//        ArrayList<String> arrayListOfStrings = new ArrayList<>(-10);

        ArrayList<String> arrayListOfStrings = new ArrayList<>(); // normal declaration and initialisation of array
    }
}
