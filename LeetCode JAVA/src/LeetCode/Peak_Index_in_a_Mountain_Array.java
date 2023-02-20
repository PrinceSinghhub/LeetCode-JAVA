package LeetCode;

public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {

        int[] arr = {24,69,100,99,79,78,67,36,26,19};

        int res =  peakIndexInMountainArray(arr);
        System.out.println(res);
    }

    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while (start<end){ //start<end we not use equal becouse goes to infinity in this case

            int mid = start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            // you are in dec part of array
            // this may be the ans, but look at left
            // this is why end != mid - 1
            if(arr[mid]<arr[mid+1]){
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
