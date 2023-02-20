package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
public class Flipping_an_Image {
    public static void main(String[] args) {

        int[][] myarr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] res = flipiningImage(myarr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));

        }

    }

    static int[][] flipiningImage(int[][] image) {
        for (int[] row: image) {
            // reverse the array
            for (int i = 0; i < (image[0].length+1)/2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length-i-1] ^ 1;
                row[image[0].length-i-1] = temp;

            }

        }
        return image;
    }
}
