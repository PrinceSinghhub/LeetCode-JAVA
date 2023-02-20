package LeetCode;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {

        char[] Char = {'c','f','j'};
        char c = 'a';

        char res = nextGreatestLetter(Char,c);
        System.out.println(res);

    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;

        if(target==letters[end] || target>letters[end]){
            return letters[0];
        }

        while (start<=end){
            int mid = start+(end-start)/2;

            if(target>letters[mid]){
                start = mid+1;
            }
            if(target<letters[mid]){
                end = mid-1;
            }

        }

        return letters[start];

    }
}
