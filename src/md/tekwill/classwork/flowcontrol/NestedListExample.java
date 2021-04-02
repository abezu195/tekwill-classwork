package md.tekwill.classwork.flowcontrol;

import java.util.ArrayList;

public class NestedListExample {

    public static void main(String[] args) {
        ArrayList<String> exams = new ArrayList<>();
        exams.add("Java");
        exams.add("Oracle");
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Basic");
        levels.add("Advanced");
        ArrayList<String> grades = new ArrayList<>();
        grades.add("Pass");
        grades.add("Fail");

        ArrayList<ArrayList<String>> nestedList = new ArrayList<>();
        nestedList.add(exams);
        nestedList.add(levels);
        nestedList.add(grades);

        for (String exam : exams) {
            for (String level : levels) {
                for (String grade : grades) {
                    System.out.println("Exam: " + exam);
                    System.out.println("Level: " + level);
                    System.out.println("Grade: " + grade);
                }
            }
        }

        for (ArrayList<String> nestedListElement : nestedList) {
            for (String element : nestedListElement) {
                System.out.println(element);
            }
        }
    }
}
