package Arrays;

public class Lucky13 {
    //Given an array of ints, return true if the array contains no 1's and no 3's.

    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[4];

        arrayOfNumbers[0] = 2;
        arrayOfNumbers[1] = 1;
        arrayOfNumbers[2] = 2;
        arrayOfNumbers[3] = 2;

        //Correct answer = true

        System.out.println(lucky13(arrayOfNumbers));
    }

    public static boolean lucky13(int[] nums) {
        for(Integer number : nums){
            if (number == 1 || number == 3){
                return false;
            }
        }
        return true;


    }

}
