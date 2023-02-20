package LeetCode;

public class Car_Pooling_1094 {
    public static void main(String[] args) {

        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        boolean ans = CarPolling(trips,capacity);
        System.out.println(ans);
    }

    static boolean CarPolling(int[][] trips, int capacity) {

        int[] TripRoute = new int[1001];

        for (int i = 0; i < trips.length; i++) {
            TripRoute[trips[i][1]]+=trips[i][0];
            TripRoute[trips[i][2]]-=trips[i][0];
        }
        int carLoad = 0;
        for (int i = 0; i < TripRoute.length; i++) {
            carLoad+=TripRoute[i];
            if (carLoad>capacity){
                return false;
            }
        }
        return true;
    }
}
