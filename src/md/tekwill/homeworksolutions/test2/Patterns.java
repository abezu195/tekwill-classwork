package md.tekwill.homeworksolutions.test2;

import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
        int patternA[][] = new int[3][3];

        for (int row = 0; row < patternA.length; ++row) {
            for (int column = 0; column < patternA[row].length; ++column) {
                if (row == column) {
                    patternA[row][column] = 1;
                }
                else {
                    patternA[row][column] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(patternA));

        int patternB[][] = new int[3][3];

        for (int row = 0; row < patternB.length; ++row) {
            for (int column = 0; column < patternB[row].length; ++column) {
                if (row + column == patternB.length - 1) {
                    patternB[row][column] = 1;
                }
                else {
                    patternB[row][column] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(patternB));

        int patternC[][] = new int[4][4];

        for (int row = 0; row < patternC.length; ++row) {
            for (int column = 0; column < patternC[row].length; ++column) {
                if ((row == 0 || row == patternC.length - 1) || (column == 0 || column == patternC.length - 1)) {
                    patternC[row][column] = 1;
                }
                else {
                    patternC[row][column] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(patternC));
    }
}
