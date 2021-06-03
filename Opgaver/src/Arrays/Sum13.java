package Arrays;

public class Sum13 {
    //Return the sum of the numbers in the array, returning 0 for an empty array.
    // Except the number 13 is very unlucky, so it does not count and
    // numbers that come immediately after a 13 also do not count.

    public static void main(String[] args) {
        int[] numbers = new int[6];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 2;
        numbers[3] = 1;
        numbers[4] = 13;
        numbers[5] = 3;

        System.out.println(sum13(numbers));
    }

    public static int sum13(int[] nums) {
        int sumOfInts = 0;

        if(nums == null){
            return 0;
        } else {
            for(int i = 0; i < nums.length ; i++){
                if(nums[i] != 13){
                    sumOfInts = sumOfInts + nums[i];
                } else if (nums[i] == 13){
                    i++;
                }
            }
        }
        return sumOfInts;
    }

}
