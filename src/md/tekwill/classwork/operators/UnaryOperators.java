package md.tekwill.classwork.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int nonLiteral = 10;
        ++nonLiteral;
        //int literal = ++10;


        int a = 15, b = 50;

        int c = ++b - a;

        System.out.println(c);
        System.out.println(b);

        // Expanding example for double and float
        float f = 10.0F;
        float e = 30.0F;
        float d = e - --f;

        System.out.println("d = " + d);
        System.out.println("f = " + f);

        double o = e - --f;

        System.out.println("d = " + d);
        System.out.println("f = " + f);

        int variable = 10;
                    //10          // 11       //11         //10            //10
        int result = variable++ + variable + variable-- - variable-- + ++variable;
//        variable = (variable + 1) + variable + (variable - 1) - (variable - 1)  + (variable + 1);

        System.out.println("variable = " + variable);
        System.out.println("result = " + result);

        variable = 10;
                     //11      //11          //10         //9         //9          //11
        result = ++variable + variable + --variable - --variable + variable++ - ++variable;

        System.out.println("variable = " + variable);
        System.out.println("result = " + result);

        // variable++ <=> variable = variable + 1;
        // --variable <=> variable = variable - 1;
    }
}
