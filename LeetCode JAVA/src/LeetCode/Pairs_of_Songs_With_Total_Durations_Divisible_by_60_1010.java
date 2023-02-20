package LeetCode;

public class Pairs_of_Songs_With_Total_Durations_Divisible_by_60_1010{
    public static void main(String[] args) {

        int[] time = {30,20,150,100,40};
        int res = findPair(time);
        System.out.println(res);
    }

    static int findPair(int[] time) {

        int[] heap = new int[60];
        int ans = 0;
        for(int n:time){
            int duration = n%60;
            ans+=heap[(60-duration)%60];
            heap[duration]++;
        }

        return ans;
    }
}
