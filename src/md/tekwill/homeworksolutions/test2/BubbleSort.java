package md.tekwill.homeworksolutions.test2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int unsortedArray[] = new int[]{10, 1, 2, 7, 9, 8, 5, 6};


        System.out.println("Before sorting: " + Arrays.toString(unsortedArray));
        int temp = 0;
        int size = unsortedArray.length;
        for (int i = 0; i < unsortedArray.length; ++i) {
            for (int j = 1; j < size - i; ++j) {
                if (unsortedArray[j-1] > unsortedArray[j]) {
                    temp = unsortedArray[j-1];
                    unsortedArray[j-1] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }

        System.out.println("After sorting: " + Arrays.toString(unsortedArray));
    }
}
