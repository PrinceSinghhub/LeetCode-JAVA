package LeetCode;
import java.util.Arrays;

public class Cells_with_Odd_Values_in_a_Matrix {
    public static void main(String[] args) {

        int n = 2;
        int m = 2;
        int[][] indices = {{1, 1},{0,0}};

        int res = oddCells(n,m,indices);
        System.out.println(res);



    }

    static int oddCells(int n, int m, int[][] indices) {
        int[][] myarr = new int[m][n];

        for (int i = 0; i < indices.length; i++) {

            for (int j = 0; j < n; j++) {
                int res = indices[i][0];
                myarr[res][j]+=1;
            }

            for (int j = 0; j < m; j++) {
                int res = indices[i][1];
                myarr[j][res]+=1;

            }

            }
        int count = 0;
        for (int i = 0; i < myarr.length; i++) {
            for (int j = 0; j < myarr[i].length; j++) {
                 if(myarr[i][j]%2!=0){
                     count++;
                 }
            }
        }

        return count;
    }

}