package LeetCode;
import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int[] res = sum_of_Each_time(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] sum_of_Each_time(int[] nums) {
        int len = nums.length;
        int[] fin = new int[len];

        for (int i = 0; i < nums.length; i++) {
            int a = 0;
            while (a<=i){
                fin[i] = fin[i]+nums[a];
                a++;
            }
        }
        return fin;


    }
}
