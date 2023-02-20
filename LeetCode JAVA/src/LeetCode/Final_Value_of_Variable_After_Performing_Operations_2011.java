package LeetCode;

public class Final_Value_of_Variable_After_Performing_Operations_2011 {
    public static void main(String[] args) {

        String[] operation = {"++X","++X","X++"};
        int res = FindEndOPersation(operation);
        System.out.println(res);

    }

    static int FindEndOPersation(String[] operation) {

        int ans = 0;
        for (int i = 0; i < operation.length; i++) {

            if(operation[i].equals("X++")){
                ans++;
            }
            if(operation[i].equals("++X")){
                ans++;
            }
            if(operation[i].equals("X--")){
                ans--;
            }
            if(operation[i].equals("--X")){
                ans--;
            }

        }
        return ans;
    }
}
