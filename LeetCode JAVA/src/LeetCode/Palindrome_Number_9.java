package LeetCode;

public class Palindrome_Number_9 {
    public static void main(String[] args) {

        int n = 555;
        boolean ans = isPalam(n);
        System.out.println(ans);
    }

    static boolean isPalam(int x) {
        int original = x;
        int rev = 0;

        while (x>0){
            rev = (rev*10)+(x%10);
            x = x/10;
        }
        if(original==rev){
            return true;
        }
        return false;

    }
}
