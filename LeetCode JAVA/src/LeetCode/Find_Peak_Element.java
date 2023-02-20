package LeetCode;

public class Find_Peak_Element {
    public static void main(String[] args) {

        int[] arr = {1,2,3,1};

        int res =  peakIndexInMountainArray(arr);
        System.out.println(res);
    }

    static int peakIndexInMountainArray(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        while (start<end){ //start<end we not use equal becouse goes to infinity in this case

            int mid = start+(end-start)/2;

            if(nums[mid]>nums[mid+1]){
                end = mid;
            }
            // you are in dec part of array
            // this may be the ans, but look at left
            // this is why end != mid - 1
            if(nums[mid]<nums[mid+1]){
                start = mid+1;
            }
            // you are in asc part of array
            // because we know that mid+1 element > mid element

        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // also return end point becouse start and end are at same point
    }
}
