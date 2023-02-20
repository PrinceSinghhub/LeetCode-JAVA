package LeetCode;

import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] nums =  {8,1,2,2,3};
        int[] res = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(res));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
