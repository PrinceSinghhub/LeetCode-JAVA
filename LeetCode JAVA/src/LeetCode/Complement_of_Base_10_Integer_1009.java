package LeetCode;
//https://leetcode.com/problems/complement-of-base-10-integer/
public class Complement_of_Base_10_Integer_1009 {
    public static void main(String[] args) {

        int n = 5;
        int res = bitWiseAns(n);
        System.out.println(res);

    }

    static int bitWiseAns(int n) {
         if (n==0){
             return 1;
         }
         int res = 0;
         int index = 0;
         while (n>0){

             if ((n&1) != 1){
                 res = res | (1<<index);
             }
             n = n>>1;
             index++;
         }
         return res;
    }
}
