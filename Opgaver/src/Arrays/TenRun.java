package Arrays;

import java.util.Arrays;

public class TenRun {
//For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
//until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

    public static void main(String[] args) {
        int[] numbers = new int[6];

        numbers[0] = 2;
        numbers[1] = 10;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 20;
        numbers[5] = 2;

        System.out.println(Arrays.toString(tenRun(numbers)));
    }


    public static int[] tenRun(int[] nums) {
        int tenMode = -1;

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] % 10 == 0 ){
                tenMode = nums[i];
            } else if (tenMode != -1){
                nums[i] = tenMode;
            }
        }
        return nums;
    }

}
