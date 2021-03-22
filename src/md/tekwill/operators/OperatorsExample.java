package md.tekwill.operators;

public class OperatorsExample {
    public static void main(String[] args) {
        int apples = 5;

        apples = apples + 5; // It is a valid assignment

        apples += 5; // It is a valid assignment, but shorter and better

        apples = apples - -3; // It is a valid assignment

        apples -= -3; // It is a valid assigment, but shorter and better;

        apples = apples * 10;

        apples *= 10;

        apples = apples / 3;

        apples /= 3;

        apples = apples % 7;

        apples %= 7;

        int pear = apples;

        double theRestOfTheApples = apples;

        // int theRestOfThePears = theRestOfTheApples; !!!This does not work, integer is smaller than double;

        theRestOfTheApples = pear; // This works as int is smaller in size than double!

    }
}
