package LeetCode;

public class Length_of_Last_Word_58 {
    public static void main(String[] args) {

        String str = "   fly me   to   the moon  ";
        int ans = FindLen(str);
        System.out.println(ans);
    }

    static int FindLen(String str) {

        String letter = str.strip();
        int ans = 0;

        int le = letter.length()-1;

        while (le>=0){
            if (letter.charAt(le) != ' ') {
                ans++;
            }
            else {
                break;
            }
            le--;
        }
        return ans;
    }
}
