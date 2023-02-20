package LeetCode;


import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {

        String s = "(]";
        boolean res = isValid(s);
        System.out.println(res);
    }

    private static boolean isValid(String s) {

        Stack<Character> arr = new Stack<>();
        for(char c: s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                arr.push(c);
            }
            else if (c == ')' && !arr.isEmpty() && arr.peek() == '('){
                arr.pop();
            }
            else if (c == '}' && !arr.isEmpty() && arr.peek() == '{'){
                arr.pop();
            }
            else if (c == ']' && !arr.isEmpty() && arr.peek() == '['){
                arr.pop();
            }
            else {
                return false;
            }
        }
        return arr.isEmpty();
    }
}

