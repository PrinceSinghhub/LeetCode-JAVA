package LeetCode;
//https://leetcode.com/problems/missing-number/
public class Missing_Number {
    public static void main(String[] args) {

        int[] nums = {0};
        int res = missingNumber(nums);
        System.out.println(res);
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while (i< nums.length){
            int correctIndex = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correctIndex]){
                swapElement(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
//        now search our elament
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == j){
                continue;
            }
            else{
                return j;
            }

        }
        return nums.length;

    }

    static void swapElement(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
