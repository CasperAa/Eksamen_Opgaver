package Arrays;

public class Sum67 {

    //Return the sum of the numbers in the array,
    // except ignore sections of numbers starting with a 6 and extending to the next 7
    // (every 6 will be followed by at least one 7).
    // Return 0 for no numbers.
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[9];

        arrayOfNumbers[0] = 2;
        arrayOfNumbers[1] = 5;
        arrayOfNumbers[2] = 6;
        arrayOfNumbers[3] = 2;
        arrayOfNumbers[4] = 5;
        arrayOfNumbers[5] = 7;
        arrayOfNumbers[6] = 2;
        arrayOfNumbers[7] = 5;
        arrayOfNumbers[8] = 1;
        //Correct answer = 15

        System.out.println(sum67(arrayOfNumbers));
    }

    public static int sum67(int[] nums) {
        int sum = 0;

        if (nums == null) {
            return 0;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 6)

                    for (int k = i + 1; k < nums.length; k++) {
                        if (nums[k] == 7) {
                            i = k;
                            break;
                        }
                    }
                else if (nums[i] == 6) {
                    sum = sum + nums[i];

                } else {

                    sum = sum + nums[i];
                }
            }
        }
        return sum;
    }
}