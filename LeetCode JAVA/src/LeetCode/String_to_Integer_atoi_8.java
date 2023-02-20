package LeetCode;
//https://leetcode.com/problems/string-to-integer-atoi/
public class String_to_Integer_atoi_8 {
    public static void main(String[] args) {

        String s = "91283472332";
        long res = Convert32Bit(s);
        System.out.println(res);
    }

     static long Convert32Bit(String s) {

        /*s = s.strip();
        StringBuilder mys = new StringBuilder();
        mys.append(s);
        int Minus = 0;
        String Number = "";

         for (int i = 0; i < mys.length(); i++) {
             if (i==0){
                 if (s.charAt(i) == '+'){
                     continue;
                 }
                 if (s.charAt(i) == '-'){
                     Minus = 1;
                     continue;
                 }
             }
             if (mys.charAt(i) >= 48 && mys.charAt(i)<=57){
                 Number+=mys.charAt(i);
             }
             else {
                 break;
             }

             }
         long ConInt = 0;
         double NegPower = Math.pow(-2,31);
         double PosPower = Math.pow(2,31);

         if(Number.length() == 0){
             ConInt = 0;
         }
         else {
             ConInt = Integer.parseInt(Number);

         }

         if (Minus == 1){
             ConInt = 0-ConInt;
             return Math.max((long)(NegPower),ConInt);
         }
         System.out.println(Number);
         return Math.min((long)(PosPower)-1,ConInt);*/
         s = s.trim();

         if (s.isEmpty())
             return 0;

         int sign = 1;
         int i = 0;
         if (s.charAt(0) == '-' || s.charAt(0) == '+'){
             sign = (s.charAt(0) == '-')? -1 : 1;

             if (s.length() < 2 || !Character.isDigit(s.charAt(1))) {
                 return 0;
             }
             i++;
         }
         int Number = 0;
         while (i < s.length()) {
             if (Character.isDigit(s.charAt(i))) {
                 int d = s.charAt(i) - '0';
                 if (Number > (Integer.MAX_VALUE - d) / 10) {
                     Number = (sign == -1)? Integer.MIN_VALUE : Integer.MAX_VALUE;
                     return Number;
                 }
                 Number = Number*10 + d;
             } else {
                 break;
             }
             i++;
         }
         return sign * Number;
     }
}


