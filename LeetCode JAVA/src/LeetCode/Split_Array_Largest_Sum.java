package LeetCode;
//https://leetcode.com/problems/split-array-largest-sum/
public class Split_Array_Largest_Sum {
    public static void main(String[] args) {

        int[] arr = {7,2,5,10,8};
        int m = 2;
        int res = splitArray(arr,m);
        System.out.println(res);


    }
    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start,nums[i]);// #in the end that loop give a maximum value or array
            end += nums[i];
        }

        while (start<end){
            //#try to find our middle as potiantial ans
            int mid = start+(end-start)/2;

            //#calculate hwo MANY PICES you can divide this in with max sum
            int sum = 0;
            int pices = 1;
            for (int n : nums){
                if(sum + n>mid){
                    sum = n;
                    pices++;
                }else {
                    sum+=n;
                }
            }
            if(pices>m){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}
