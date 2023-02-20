package LeetCode;
//# https://leetcode.com/problems/implement-strstr/
public class Implement_strStr_28 {
    public static void main(String[] args) {

        String name = "";
        String find = "";

        int ans = FindFirstIndex(name,find);
        System.out.println(ans);
    }

    static int FindFirstIndex(String haystack, String needle) {

        if (haystack.length() == 0 && needle.length() == 0){
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length()+1; i++) {
            if ((haystack.substring(i,i+needle.length())).equals(needle)){
                return i;
            }
        }
        return -1;

    }
}
