package md.tekwill.homeworksolutions.homework0704;

public class DuplicateElementsExercise {
    public static void main(String[] args) {

        int unsortedArrayWithDuplicates[] = {-1, 5, 2, 3, -1, 5, 7, -1};

        int duplicateCounter = 0;
        for (int i = 0; i < unsortedArrayWithDuplicates.length; ++i) {
            for (int j = i + 1; j < unsortedArrayWithDuplicates.length; ++j) {
                if (unsortedArrayWithDuplicates[i] == unsortedArrayWithDuplicates[j]) {
                    duplicateCounter++;
                    break;
                }
            }
        }

        System.out.println("Number of duplicates: " + duplicateCounter);

        int temp;
        for (int i = 0; i < unsortedArrayWithDuplicates.length; ++i) {
            for (int j = i + 1; j < unsortedArrayWithDuplicates.length; ++j) {
                if (unsortedArrayWithDuplicates[i] > unsortedArrayWithDuplicates[j]) {
                    temp = unsortedArrayWithDuplicates[i];
                    unsortedArrayWithDuplicates[i] = unsortedArrayWithDuplicates[j];
                    unsortedArrayWithDuplicates[j] = temp;
                }
            }
        }

        duplicateCounter = 0;
        for (int index = 1; index < unsortedArrayWithDuplicates.length; ++index) {
            if (unsortedArrayWithDuplicates[index - 1] == unsortedArrayWithDuplicates[index]) {
                duplicateCounter++;
            }
        }

        System.out.println("Number of duplicates: " + duplicateCounter);

    }
}
