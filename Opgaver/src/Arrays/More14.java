package Arrays;

public class More14 {
    public static void main(String[] args) {
        int[] numbers = new int[4];

        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;
        numbers[3] = 4;

        System.out.println(more14(numbers));
    }

    public static boolean more14(int[] nums) {
        int amountOfOne = 0;
        int amountOfFour = 0;

        for(Integer numbers : nums){
            if(numbers == 1){
                amountOfOne++;
            } else if (numbers == 4){
                amountOfFour++;
            }
        }
        return amountOfOne > amountOfFour;
    }
}
