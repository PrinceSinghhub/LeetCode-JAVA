package LeetCode;
//https://leetcode.com/problems/search-insert-position/
public class Search_Insert_Position_35 {
    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int target = 4;
        int ans = FindPosition(nums,target);
        System.out.println(ans);
    }

    static int FindPosition(int[] nums, int target) {

        int start = 0;
        int end = nums.length;

        while (start < end){

            int mid = (int)(start+(end-start)/2);

            if (nums[mid] == target ){
                return mid;
            }
            if (nums[mid] > target ){
                end = mid;
            }
            if (nums[mid] < target ){
                start = mid+1;
            }
        }
        return start;
    }
}
