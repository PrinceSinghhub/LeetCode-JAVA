package LeetCode;
//#hard level question on leetcode: https://leetcode.com/problems/find-in-mountain-array/
public class Find_in_Mountain_Array {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,3,1}; int target = 3;
        int res = MinimumIndex(array,target);
        System.out.println(res);
    }


    static int MinimumIndex(int[] array, int target) {

        int PeakValue = GreatestNumber(array);
        int AssendingSearch = OrderAgnosist(array,target,0,PeakValue);
        if(AssendingSearch != -1){
            return AssendingSearch;
        }
        else {
            int DesindingSearch = OrderAgnosist(array,target,PeakValue+1,array.length-1);
            return DesindingSearch;
        }

    }

    static int OrderAgnosist(int[] myarr, int element, int start, int end) {

        //        todo for assending
        if(myarr[start]<myarr[end]){
            // means array are assending order


            while (start<=end){

                int mid = start+(end-start)/2;

                if(element>myarr[mid]){
                    start = mid+1;
                }
                if(element<myarr[mid]){
                    end = mid-1;
                }
                if(element==myarr[mid]){
                    return mid;
                }
            }

        }
//        todo for desending
        if(myarr[start]>myarr[end]){
            // means array are dessending order


            while (start<=end){

                int mid = start+(end-start)/2;

                if(element>myarr[mid]){
                    end = mid-1;
                }
                if(element<myarr[mid]){
                    start = mid+1;
                }
                if(element==myarr[mid]){
                    return mid;
                }
            }
        }

        return -1;

    }

    static int GreatestNumber(int[] arr) {
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



