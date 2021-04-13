package md.tekwill.homeworksolutions.homework0704;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMatrixExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the matrix size: ");
        int matrixSize = scanner.nextInt();

        int matrix[][] = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrix.length; ++row) {
            for (int column = 0; column < matrix[row].length; ++column) {
                System.out.print("Give a value on [" + row + "][" + column + "] position: " );
                matrix[row][column] = scanner.nextInt();
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < matrix.length; ++row) {
            for (int column = 0; column < matrix[row].length; ++column) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix));

        for (int[] listFromMatrix : matrix) {
            for (int number : listFromMatrix) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
