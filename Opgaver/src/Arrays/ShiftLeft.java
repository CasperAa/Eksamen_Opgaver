package Arrays;

import java.util.Arrays;

public class ShiftLeft {
    //Return an array that is "left shifted" by one --
    //      so {6, 2, 5, 3}
    // returns {2, 5, 3, 6}.
    // You may modify and return the given array, or return a new array.

    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 4;
        numbers[3] = 5;
        numbers[4] = 6;

        System.out.println((Arrays.toString(shiftLeft(numbers))));
    }

    public static int[] shiftLeft(int[] nums) {

        if(nums.length >= 2) {
            int tempIndexZero = nums[0];
            for(int i = 0 ; i < nums.length-1 ; i++){
                nums[i] = nums[i+1];
            }
            nums[nums.length-1] = tempIndexZero;
        }
        return nums;
    }
}

