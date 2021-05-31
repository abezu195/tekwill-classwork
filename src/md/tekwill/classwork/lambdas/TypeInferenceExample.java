package md.tekwill.classwork.lambdas;


interface I1 {

}

interface I2 {
    void play();
    void play(int numberOfPlayers);
}

interface I3 {
    void play(int numberOfPlayers);
}


public class TypeInferenceExample {
    public static void main(String[] args) {
        Validate validate =  (s, a) -> {
            s = s.substring(a);
            return s.startsWith("p");
        };

        Validate fullSyntaxLambda = (String s, Integer a) -> {
            s = s.substring(a);
            return s.startsWith("p");
        };

        String s;
        if (true)
            s = "name";
        else
            s = "noname";

        boolean isTrue = validate.validate("plai", 1);
        System.out.println(isTrue);
    }
}
