package Arrays;

public class CenteredAverage {
    public static void main(String[] args) {

        int[] numbers = new int[7];

        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 5;
        numbers[3] = 5;
        numbers[4] = 10;
        numbers[5] = 8;
        numbers[6] = 7;

        System.out.println(centeredAverage(numbers));


    }

    public static int centeredAverage(int[] nums) {
        int maxInt = nums[0];
        int minInt = nums[0];


        int allNumbers = 0;
        for (Integer number : nums) {
            allNumbers = allNumbers + number;
            if (number > maxInt) {
                maxInt = number;

            } else if (number < minInt) {
                minInt = number;
            }

        }
        return (allNumbers - (maxInt + minInt)) / (nums.length - 2);
    }
}
