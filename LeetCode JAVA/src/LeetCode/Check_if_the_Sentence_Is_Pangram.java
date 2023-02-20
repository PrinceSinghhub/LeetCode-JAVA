package LeetCode;

public class Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean res = checkIfPangram(sentence);
        System.out.println(res);
    }

    static boolean checkIfPangram(String sentence) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int count=0;
        for (int i = 0; i < alpha.length(); i++) {
            char n = alpha.charAt(i);
            String s = Character.toString(n);
            if(sentence.contains(s)){
                count++;
            }
        }
        if(count==26){
            return true;
        }
        return false;
    }
}
