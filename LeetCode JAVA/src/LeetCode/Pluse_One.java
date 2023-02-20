package LeetCode;
import java.util.Arrays;

//https://leetcode.com/problems/plus-one/
public class Pluse_One {
    public static void main(String[] args) {

        int[] arr = {9};
        int[] res = PluseOne(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] PluseOne(int[] digits) {

        for (int i = digits.length - 1; i >=0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
