package LeetCode;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {

        int[] myarr = {555,901,482,1771};
        int res = findNumbers(myarr);
        System.out.println(res);

        //        todo trick to find no of digit
        System.out.println((int)(Math.log10(myarr[3]))+1);
    }

    static int findNumbers(int[] nums) {
        int res = 0;
        for(int n:nums){
//            todo my aprroch
//            int count = 0;
//            while (n>0){
//                if(n>0){
//                    count++;
//                }
//                n = n/10;
//            }
//            if(count%2==0){
//                res++;
//            }
//            todo optimize
            int a = (int)(Math.log10(n))+1;
            if(a%2==0){
                res++;
            }
        }
        return res;
    }
}
