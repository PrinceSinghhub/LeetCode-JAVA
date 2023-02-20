package LeetCode;

import java.util.Arrays;

public class Shuffle_the_Array {
    public static void main(String[] args) {

        int[] myarr = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] res = SuffalArray(myarr,n);
        System.out.println(Arrays.toString(res));

    }

    static int[] SuffalArray(int[] nums, int n) {
        int[] first = new int[n];
        int[] last = new int[n];

        int[] Fin = new int[n*2];

        for (int i = 0; i < n; i++) {
            first[i] = nums[i];
        }

        int a = 0;
        for (int i = n; i < nums.length; i++) {
            last[a] = nums[i];
            a++;
        }

        int f= 0;
        int l = 0;

        for (int i = 0; i < Fin.length;i++) {
            if(i%2==0){
                Fin[i] = first[f];
                f++;
            }
           else{
                Fin[i] = last[l];
                l++;
            }
        }
        return Fin;
    }
}
