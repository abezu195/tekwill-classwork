package md.tekwill.classwork.arrays;

import java.util.Arrays;

public class ArrayDeclarationExample {
    public static void main(String[] args) {
        int[] firstOneDimensionalArray; // one-dimensional array
        int secondOneDimensionalArray[]; // one-dimensional array
        int[] thirdMultiDimensionalArray[]; // two-dimensional array
        int [][] fourthMultiDimensionalArray; // two-dimensional array
        int fifthMultiDimensionalArray[][]; // two-dimensional array


        int[][] myArray;
//        myArray = new int[]; Not acceptable to assign one-dimensional array to two-dimensional array
//        myArray = new int[][3]; Not acceptable to give size of lists of list and not give size to lists / to give number of columns but not number of rows

        String[] strings = new String[3];
        int[] numbers = new int[3];

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(numbers));

        for (int index = 0; index < numbers.length; ++index) {
            numbers[index] = index * 2;
        }

        for (int index = 0; index < numbers.length; ++index) {
            if (index == 0) {
                System.out.print("[");
            }
            System.out.print(numbers[index]);
            if (index == numbers.length - 1) {
                System.out.print("]");
            }
            else {
                System.out.print(", ");
            }
        }

        numbers[3] = 4;

        int size = 3;
        int[] mySizedArray = new int[size];
        size = 4;

        for (int index = 0; index < mySizedArray.length; ++index) {
            System.out.println(mySizedArray[index]);
        }

        int[][] bidimensional = new int[2][3];

        for (int rowIndex = 0; rowIndex < bidimensional.length; ++rowIndex) {
            for (int columnIndex = 0; columnIndex < bidimensional[rowIndex].length; ++columnIndex) {
                bidimensional[rowIndex][columnIndex] = rowIndex + columnIndex;
            }
        }
        System.out.println();
        System.out.println();

        for (int rowIndex = 0; rowIndex < bidimensional.length; ++rowIndex) {
            System.out.println(Arrays.toString(bidimensional[rowIndex]));
        }

        int index = 0;
        int[] anotherArray = new int[3];

        while (index < anotherArray.length) {
            anotherArray[index] = index;
            ++index;
        }
    }
}
