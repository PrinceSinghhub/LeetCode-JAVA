package LeetCode;

public class Find_the_Town_Judge_997 {
    public static void main(String[] args) {

        int n = 5;
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};

        int ans = TownJudge(n,trust);
        System.out.println(ans);
    }

    static int TownJudge(int n, int[][] trust) {
        int[] TrustedPeople = new int[n+1];

        for (int i = 1; i < trust.length; i++) {
            int first = trust[i][0];
            int second = trust[i][1];
            TrustedPeople[first]-=1;
            TrustedPeople[second]+=1;
        }

        for (int i = 0; i < n+1; i++) {

            if(TrustedPeople[i]==n-1){
                return i;
            }

        }
        return -1;
    }
}
