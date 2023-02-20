package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4}; int[] index = {0,1,2,2,1};
        int[] res = createTargetArray(nums,index);
        System.out.println(Arrays.toString(res));

    }

    static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> mylist = new ArrayList<>();
        int[] res = new int[index.length];

        int i = 0;
        for(int n:index) {
            mylist.add(n, nums[i]);
            i++;
        }
        for (int j = 0; j < mylist.size(); j++) {
            res[j] = mylist.get(j);

        }
        return res;
    }
}
