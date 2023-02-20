package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {

        int[] arr = {12,1,12};
        int extra = 10;
        gratest_cabdies(arr,extra);

    }

    static void gratest_cabdies(int[] candies, int extraCandies) {

        int max = candies[0];
        ArrayList<Boolean> ans = new ArrayList<Boolean>();

        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            int r = candies[i]+extraCandies;
            if(r>=max){
                ans.add(true);
            }
            else {
                ans.add(false);
            }
        }
        System.out.println(ans);

    }
}
