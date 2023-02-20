package LeetCode;

import java.util.Arrays;

public class Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {

        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        int[] res = luckeyNumber(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] luckeyNumber(int[][] matrix) {

        int l = matrix.length;
        for (int i = 0; i < l; i++) {

            int min = 0;
            int minIndex = 0;

            int[] roll_coll = new int[matrix.length];
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            System.out.println(min);
            System.out.println(minIndex);
            for (int j = 0; j < l; j++) {
                roll_coll[j] = matrix[j][minIndex];
            }
            int max = 0;
            for (int j = 0; j < l; j++) {
                if(roll_coll[j]>max){
                    max = roll_coll[j];
                }
            }
            if(max==min){
                return new int[] {min};
            }
            else{
                max = 0;
            }
        }
        return new int[] {0};
    }
}
