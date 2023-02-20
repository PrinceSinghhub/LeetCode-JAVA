package LeetCode;

public class Find_Celling_Of_Number {
    public static void main(String[] args) {

        int[] myarr = {2,3,5,9,14,16,18};
        int cellingValue = 150;

        int res = CellingValue(myarr,cellingValue);
        System.out.println(res);
    }

    static int CellingValue(int[] myarr, int cellingValue) {

        int start = 0;
        int end = myarr.length-1;

        if(cellingValue>myarr[end]-1){
            return -1;//means no value are present
        }
        while (start<=end){

            int mid = start+(end-start)/2;

            if(cellingValue>myarr[mid]){
                start = mid+1;
            }
            if(cellingValue<myarr[mid]){
                end = mid-1;
            }
            if(cellingValue==myarr[mid]){
                return myarr[mid];
            }
        }

        return myarr[start];

    }
}

