package Loops;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintPattern {
    public static void main(String[] args) {


        int one = 1;
        int two = 12;
        int three = 123;
        int four = 1234;
        int five = 12345;

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(one, two, three, four, five));

        for (Integer row: numbers) {
            System.out.println(row);
        }
    }
}
