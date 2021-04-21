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

        double usedInBothIfAndElseBlocks = 0;
        if (val > 100) {
            double newAverage = getAverage();
            usedInBothIfAndElseBlocks = newAverage;
            System.out.println("You can't set an average bigger than maximum, average has been reset to 0");
        }
        else {
            double setAverage = val;
            usedInBothIfAndElseBlocks = setAverage;
//            setAverage = newAverage; Variable 'newAverage' was declared in 'if block', so it is not accessible in 'else block'
        }

        if (usedInBothIfAndElseBlocks > 0) {
            // do something else
        }

        int lastIndex = 0;
        for (int index = 0; index < 10; index++) {
            lastIndex = index;
        }

        System.out.println(lastIndex);

        boolean runWhileBlock = true;
        while(runWhileBlock) {
            int whileBlockVariable = 12;
            runWhileBlock = false;
        }

//        System.out.println(whileBlockVariable); Variables declared in loop blocks cannot be used outside themselves;

        {
            int number  = 0;
            // Everything that is declared inside a block, has a smaller scope than it's outer block
        }

//        int anotherNumber = number; Variable 'number' which is declared in the precedent block is already out of scope, so it is not visible at this moment of the program

    }

    public boolean someCalculation() {
        boolean simplerExpressionResult = (false || true);
        boolean expressionResult;
        expressionResult = simplerExpressionResult || (true || true) && (false || true);
        return expressionResult;
    }

//    public void forwardReference() {
//        int a = b;
//        int b = 20;
//    }
}
