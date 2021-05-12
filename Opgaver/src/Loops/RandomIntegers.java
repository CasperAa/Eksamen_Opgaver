package Loops;

import java.util.ArrayList;
import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();

        int sumOfAllNumbers = 0;
        for(int i = 1; i < 100 ; i++){
            Random randomInt = new Random();
            int maxInt = 100;
            int randomNumber = randomInt.nextInt(maxInt);
            numbers.add(randomNumber);
            sumOfAllNumbers += randomNumber;

        }
        System.out.println(sumOfAllNumbers);

    }
}
