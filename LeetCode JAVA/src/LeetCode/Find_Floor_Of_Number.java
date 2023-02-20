package LeetCode;

public class Find_Floor_Of_Number {
    public static void main(String[] args) {

        int[] myarr = {2,3,5,9,14,16,18};
        int floorValue = 1;

        int res = FloorValue(myarr,floorValue);
        System.out.println(res);
    }

    static int FloorValue(int[] myarr, int floorValue) {
        int start = 0;
        int end = myarr.length-1;

        if(floorValue<myarr[0]){
            return -1;//means no value are present
        }

        while (start<=end){

            int mid = start+(end-start)/2;

            if(floorValue>myarr[mid]){
                start = mid+1;
            }
            if(floorValue<myarr[mid]){
                end = mid-1;
            }
            if(floorValue==myarr[mid]){
                return myarr[mid];
            }
        }

        return myarr[end];

    }
}

