package md.tekwill.classwork.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String newLine = bufferedReader.readLine();
        int myInteger = Integer.parseInt(newLine);

        System.out.println("My integer converted from line in BufferedReader is: " + myInteger);

        char[] buffer = new char[20];
        bufferedReader.read(buffer, 0, buffer.length);

        System.out.println("New line is: " + newLine);
        System.out.println("First 20 characters of new line are: " + Arrays.toString(buffer));
    }
}
