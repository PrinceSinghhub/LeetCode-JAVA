package LeetCode;

public class find_the_rotation_count_in_rotated_sorted_array {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int res = FindRoutation(arr);
        System.out.println(res+1);


    }

    static int FindRoutation(int[] arr) {
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
