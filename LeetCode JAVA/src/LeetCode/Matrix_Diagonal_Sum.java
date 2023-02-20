package LeetCode;
import java.util.ArrayList;

//https://leetcode.com/problems/matrix-diagonal-sum/
public class Matrix_Diagonal_Sum {

    public static void main(String[] args) {

        int[][] mat = {{1,2,3},
                {1,1,1},
                {1,1,1}};

        int res = diagonalSum(mat);
        System.out.println(res);
    }

    static int diagonalSum(int[][] mat) {

        ArrayList<Integer> ans = new ArrayList<>();

        int len = mat.length-1;
        for (int i = 0; i < mat.length; i++) {
            ans.add(mat[i][i]);
            ans.add(mat[i][len]);
            len--;
        }

        int res = 0;
        for(int n:ans){
            res+=n;
        }

        if((mat.length-1)%2 == 0){
            int mid = (mat.length-1) / 2;
            res = res - mat[mid][mid];
            return res;
        }
        return res;
    }
}
