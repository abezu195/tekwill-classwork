package md.tekwill.classwork.arrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[4];
        String[] partsOfYear = new String[]{"Summer", "Autumn", "Winter", "Spring"};
        //same as above
        String[] partsOfYearLongVersion = new String[4];
        partsOfYearLongVersion[0] = "Summer";
        partsOfYearLongVersion[1] = "Autumn";
        partsOfYearLongVersion[2] = "Winter";
        partsOfYearLongVersion[3] = "Spring";

        int[] scores = {8, 4, 9, 10};

        int[][] arraysOfScores = {{1, 2}, {3, 5, 7, 9}};

        String[] arrayOfStrings = {"First", "Second", "Third"};

        String[][] multiDimensionalArray = {
                {"Autumn", "Spring"},
                null,
                {"Jan", "Mar", "May", "Jun"}
        };

        String[][][] multiDimensionalArray2 = new String[][][]{
                new String[][]{
                        new String[]{"Hi", null},
                        new String[]{"Hello there"}
                }
        };

        System.out.println(multiDimensionalArray2[0][0][0]);
        System.out.println(multiDimensionalArray2[0][0][1]);
        System.out.println(multiDimensionalArray2[0][1][0]);
        System.out.println();

        multiDimensionalArray[1] = new String[]{"some String"};

        System.out.println(Arrays.deepToString(multiDimensionalArray));
        for (int i = 0; i < multiDimensionalArray.length; i++) {
            for (int j = 0; multiDimensionalArray[i] != null && j < multiDimensionalArray[i].length; j++) { //avoid null pointer exception
                // i = 0, j = 0; -> i = 0, j = 1; first cycle
                // i = 1, j = 0; second cycle
                // i = 2, j = 0; -> i = 2, j = 1; -> i = 2, j = 3 third cycle
                System.out.println(multiDimensionalArray[i][j]);
            }
        }
    }
}
