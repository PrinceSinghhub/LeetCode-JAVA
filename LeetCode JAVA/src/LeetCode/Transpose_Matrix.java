package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/transpose-matrix/
public class Transpose_Matrix {
    public static void main(String[] args) {

        int[][] arr ={{1,2,3},{4,5,6}};
        int[][] res = transpose(arr);
        for(int[] i : res){
            System.out.println(Arrays.toString(i));
        }


    }

    static int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int collom = matrix[0].length;

        int[][] ans = new int[collom][row];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[j][i] = matrix[i][j];
            }

        }
        return ans;

    }
}
