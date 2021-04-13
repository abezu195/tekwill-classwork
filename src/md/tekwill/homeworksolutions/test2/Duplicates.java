package md.tekwill.homeworksolutions.test2;

public class Duplicates {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 5, 6, 8, 5, 1};

        int count = 0;
        for (int i = 0; i < a.length; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);

        int temp = 0;
        int size = a.length;
        for (int i = 0; i < a.length; ++i) {
            for (int j = 1; j < size - i; ++j) {
                if (a[j-1] > a[j]) {
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }

        count = 0;
        for (int i = 1; i < a.length; ++i) {
            if (a[i] == a[i-1]) count++;
        }

        System.out.println(count);
    }
}
