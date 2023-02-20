package LeetCode;
//https://leetcode.com/problems/two-sum/submissions/
import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 18;
        int[] ans = find_Sum(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] find_Sum(int[] nums, int target) {

        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i,j};

                }
            }
        }
        return new int[] {0,0};
    }
}
