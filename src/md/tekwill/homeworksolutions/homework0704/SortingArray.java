package md.tekwill.homeworksolutions.homework0704;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortingArray {
    public static void main(String[] args) {
        int[] unsortedArray = {10, 3, 7, 8, 2, 1, 11, 5};

        int temp;
        int size = unsortedArray.length;

        System.out.println(Arrays.toString(unsortedArray));
        for (int i = 0; i < size; ++i) {
            for (int j = i + 1; j < size; ++j) {
                if (unsortedArray[i] < unsortedArray[j]) {
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
            System.out.println(i+1 + " iteration: " + Arrays.toString(unsortedArray));
        }

        int randomArray[] = new int[200000000];

        Random random = new Random();
        for (int i = 0; i < randomArray.length; ++i) {
            randomArray[i] = random.nextInt(100);
        }

        int randomArrayCopy[] = Arrays.copyOf(randomArray, randomArray.length);

        System.out.println("Start sorting original array");

        LocalTime firstSortingStart = LocalTime.now();

        for (int i = 0; i < size; ++i) {
            for (int j = i + 1; j < size; ++j) {
                if (randomArray[i] < randomArray[j]) {
                    temp = randomArray[i];
                    randomArray[i] = randomArray[j];
                    randomArray[j] = temp;
                }
            }
        }

        LocalTime firstSortingEnd = LocalTime.now();

        System.out.println("Finished sorting original array, time: " + firstSortingEnd + " - " + firstSortingStart);

        LocalTime secondSortingStart = LocalTime.now();
        System.out.println("Start sorting copy array");
        Arrays.sort(randomArrayCopy);
        LocalTime secondSortingEnd = LocalTime.now();
        System.out.println("Finished sorting copy array, time: " + secondSortingEnd + " - " + secondSortingStart);
    }
}
