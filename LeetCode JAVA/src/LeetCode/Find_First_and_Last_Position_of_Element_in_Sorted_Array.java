package LeetCode;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] res = searchRange(nums,target);
        System.out.println(Arrays.toString(res));
    }

    static int[] searchRange(int[] nums, int target) {


        int[] res = {-1,-1};

        int start = findIndex(nums,target,true);
        int end = findIndex(nums,target,false);

        res[0] = start;
        res[1] = end;
        return res;

    }

    static int findIndex(int[] nums,int target,boolean StartIndex){

        int start = 0;
        int end = nums.length-1;

        int ans = -1;

        while (start<=end){

            int mid = start+(end-start)/2;

            if(target>nums[mid]){
                start = mid+1;
            }
            if(target<nums[mid]){
                end = mid-1;
            }
            if(target==nums[mid]){
                ans = mid;
                if(StartIndex){ //also write StartIndex==true
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }

        }
        return ans;
    }
}

