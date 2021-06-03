package Arrays;

import java.util.Arrays;

public class Pre4 {
    //Given a non-empty array of ints, return a new array containing the elements
    // from the original array that come before the first 4 in the original array.
    // The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[5];

        arrayOfNumbers[0] = 2;
        arrayOfNumbers[1] = 1;
        arrayOfNumbers[2] = 2;
        arrayOfNumbers[3] = 2;
        arrayOfNumbers[4] = 4;


        //Correct answer = true

        System.out.println(Arrays.toString(pre4(arrayOfNumbers)));
    }

    public static int[] pre4(int[] nums) {
        int sizeOfNewArray = 0;
        for(Integer number : nums){
            if(number != 4){
                sizeOfNewArray++;
            } else {
                break;
            }
        }
        int[] newArray = new int[sizeOfNewArray];
        for(int i = 0; i < sizeOfNewArray ; i++){
            newArray[i] = nums[i];
        }
        return newArray;
    }
}
