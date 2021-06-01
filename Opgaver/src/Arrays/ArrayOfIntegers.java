package Arrays;

import java.lang.reflect.Array;

public class ArrayOfIntegers {
    public static void main(String[] args) {

        int[] numbers = new int[6];

        numbers[0] = 11;
        numbers[1] = 22;
        numbers[2] = 33;
        numbers[3] = 44;
        numbers[4] = 55;
        numbers[5] = 66;

        int oddNumbers = 0;
        for (Integer num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
                oddNumbers += num;
            }
        }
        System.out.println(oddNumbers);
    }
}
