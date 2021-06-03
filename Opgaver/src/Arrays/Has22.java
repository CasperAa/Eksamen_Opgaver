package Arrays;

public class Has22 {
    //Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[4];

        arrayOfNumbers[0] = 2;
        arrayOfNumbers[1] = 1;
        arrayOfNumbers[2] = 2;
        arrayOfNumbers[3] = 2;

        //Correct answer = true

        System.out.println(has22(arrayOfNumbers));
    }

    public static boolean has22(int[] nums) {

        int two = 2;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == two && nums[i + 1] == two) {
                return true;
            }
        }

        return false;
    }

}
