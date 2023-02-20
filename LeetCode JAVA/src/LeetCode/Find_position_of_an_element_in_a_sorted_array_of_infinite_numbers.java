package LeetCode;
// gfg quesrion: https://ide.geeksforgeeks.org/qzl8rxyNI7
public class Find_position_of_an_element_in_a_sorted_array_of_infinite_numbers {
    public static void main(String[] args) {

        int[] myarr = {3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170,190,200,210,220,250,290};//this is infinity array
        int target = 160;

        int res = ans(myarr,target);
        System.out.println(res);
    }

    static int ans(int[] myarr, int target) {
        /*'''first find the range of our chunk
        and start our search with box size 2
         '''*/
        int start = 0;
        int end = 1;

        //condition for our taget vale lie thar chunk or not
        while (target>myarr[end]){

            int temp = end+1; // our new Start value

            /*'''now double the sixe of chunk or box
            for chek lie our value or not
            formula = prevese end + sixeofBox*2'''
             */

            end = end + (end-start+1)*2;//next new end point
            start = temp;
        }

        return FindIndex(myarr,target,start,end);

    }

    static int FindIndex(int[] myarr, int target, int start, int end) {

        while (start<=end){

            int mid = start+(end-start)/2;

            if(target>myarr[mid]){
                start = mid+1;
            }
            if(target<myarr[mid]){
                end = mid-1;
            }
            if(target==myarr[mid]){
                return mid;
            }

        }

        return -1; // means element are not found

    }
}

