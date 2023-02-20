package LeetCode;

import java.util.Arrays;

public class Product_of_Array_Except_Self_238 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int[] ans = findProduct(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findProduct(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = 1;

        }

        int left = 1;
        for (int i = 0; i < nums.length; i++) {

            ans[i] = ans[i]*left;
            left = left*nums[i];

        }
        int right = 1;
        for (int i = nums.length-1; i>=0; i--) {

            ans[i] = ans[i]*right;
            right = right*nums[i];

        }
        return ans;
    }
}
