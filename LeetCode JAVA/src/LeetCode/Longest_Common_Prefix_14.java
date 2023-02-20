package LeetCode;
//# https://leetcode.com/problems/longest-common-prefix

public class Longest_Common_Prefix_14 {
    public static void main(String[] args) {

        String[] str = {"cir","car"};
        String ans = LCS(str);
        System.out.println(ans);
    }

    private static String LCS(String[] strs) {

        String smallString = strs[0];
        for (int i = 0; i < strs.length; i++) {
            int currentStringLenght = strs[i].length();
            if (currentStringLenght<=smallString.length()){
                smallString = strs[i];
            }
        }

        if (strs.length == 0 || smallString.length()==0){
            return "";
        }
        System.out.println(smallString);

        String Prefix = "";
        for (int i = 0; i < smallString.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (smallString.charAt(i) != strs[j].charAt(i)){
                    return Prefix;
                }
            }
            Prefix = smallString.substring(0,i+1);

        }

        return smallString;
    }
}
