package LeetCode;
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class Rotated_Binary_Search {
    public static void main(String[] args) {

        int[] myarr = {5,1,3};
        int taaget = 5;
        int res = SeachElement(myarr,taaget);
        System.out.println(res);


    }

    static  int SeachElement(int[] nums,int target){

        int pivot = FindPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return BinarySearch(nums, target, 0 , nums.length - 1);
        }
        // if pivot is found, you have found 2 asc sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }

        if(target>=nums[0]){
             return BinarySearch(nums,target,0,pivot-1);
        }
        return BinarySearch(nums,target,pivot+1,nums.length-1);

    }

    static int BinarySearch(int[] nums, int target, int start, int end) {

        while (start<=end){
            int mid = start+(end-start)/2;

            if(target>nums[mid]){
                start = mid+1;
            }
            if(target<nums[mid]){
                end = mid-1;
            }
            if(target==nums[mid]){
                return mid;
            }
        }
        return -1;
    }

    // this will not work in duplicate values
    static int FindPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){

            int mid = start+(end-start)/2;
            // 4 cases over here

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;

            }
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }
            if(arr[start]<=arr[mid]){
                start = mid+1;
            }
        }
        return -1;

    }
}
