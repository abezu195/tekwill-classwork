package md.tekwill.classwork.flowcontrol.whileloop;

public class ContinueStatementExample {
    public static void main(String[] args) {

        // 1 3 5 7 9 .. 15;
        int i = 1;
        while (true) {
            if (i == 15) {
                break;
            }
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
