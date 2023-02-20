package LeetCode;

import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        int[] res = concetination(nums);
        System.out.println(Arrays.toString(res));
    }

    static int[] concetination(int[] nums) {
        int len = nums.length*2;
        int[] conc = new int[len];

        int index = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0;j<nums.length;j++){
                conc[index] = nums[j];
                index++;
            }
        }
        return conc;
    }
}

