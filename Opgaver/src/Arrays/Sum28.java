package Arrays;

public class Sum28 {
    //Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

    public static void main(String[] args) {
        int[] numbers = new int[6];

        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 2;
        numbers[3] = 2;
        numbers[4] = 2;
        numbers[5] = 3;

        System.out.println(sum28(numbers));
    }

    public static boolean sum28(int[] nums) {

        int sumOfTwos = 0;

        for(Integer number : nums){
            if(number == 2){
                sumOfTwos += 2;
            }
        }
        return sumOfTwos == 8;
    }

}
