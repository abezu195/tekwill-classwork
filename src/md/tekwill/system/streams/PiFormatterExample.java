package md.tekwill.system.streams;

import java.text.DecimalFormat;

public class PiFormatterExample {
    public static void main(String[] args) {

        float pi = 3.1428733F;

        String formattedPi = String.format("%.04f", pi);
        System.out.println("formatted pi with 4 decimals: " + formattedPi);

        DecimalFormat formatter = new DecimalFormat("#.####");
        formattedPi = formatter.format(pi);
        System.out.println("formatted pi with 4 decimals: " + formattedPi);
    }
}
