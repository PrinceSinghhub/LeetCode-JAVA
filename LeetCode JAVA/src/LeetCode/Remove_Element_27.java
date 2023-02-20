package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Element_27 {
    public static void main(String[] args) {

        int[] arr = {3,2,2,3};
        int val = 3;
        int[] ans = removeElement(arr,val);
        System.out.println(Arrays.toString(ans));
    }

    static int[] removeElement(int[] nums, int val) {

        ArrayList<Integer> myarr = new ArrayList<Integer>();
        for(int i:nums){
            if(i!=val){
                myarr.add(i);
            }
        }
        int[] ans = new int[myarr.size()];
        for (int i = 0; i < myarr.size(); i++) {
            ans[i] = myarr.get(i);

        }
        return ans;

//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]!=val){
//                nums[index] = nums[i];
//                index++;
//            }
//        }
//        return index;

    }
}

