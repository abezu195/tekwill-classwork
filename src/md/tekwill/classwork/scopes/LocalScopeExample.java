package md.tekwill.classwork.scopes;

public class LocalScopeExample {
    private static final double MAX_MARKS = 100;
    private double marks1, marks2, marks3;

    public double getAverage() {
        double average = 0;
        average = ((marks1 + marks2 + marks3) / (MAX_MARKS * 3)) * 100;
        return average;
    }

    public void setAverage(double val) {
//        average = val; Won't compile since 'average' is a local variable of method 'getAverage()' and is not visible outside it.

        if (val > 100) {
            double newAverage = getAverage();
            System.out.println("You can't set an average bigger than maximum, average has been reset to 0");
        }
        else {
            double setAverage = val;
//            setAverage = newAverage; Variable 'newAverage' was declared in 'if block', so it is not accessible in 'else block'
        }

        for (int index = 0; index < 10; index++) {

        }

        {
            int number  = 0;
            // Everything that is declared inside a block, has a smaller scope than it's outer block
        }

//        int anotherNumber = number; Variable 'number' which is declared in the precedent block is already out of scope, so it is not visible at this moment of the program

    }
}
