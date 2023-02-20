package LeetCode;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {

        int[][] myarr = {{1,5},
                         {7,3},
                         {3,5}};
        int r = rich_man(myarr);
        System.out.println(r);
    }

    static int rich_man(int[][] accounts) {
        int len = accounts.length;
        int[] money = new int[len];

        for (int i = 0; i < accounts.length; i++) {
            int a = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                a+=accounts[i][j];

            }
            money[i] = a;
        }

        int max = money[0];
        for (int i = 0; i < money.length; i++) {
            if(money[i]>max){
                max = money[i];
            }
        }

        return max;
    }
}
