import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] car = new double[n][2];

        for (int j = 0; j < n; j++) {
            car[j][0] = position[j];
            car[j][1] = (double)(target - position[j]) / speed[j];
        }

        // Sort cars by position
        Arrays.sort(car, (a, b) -> Double.compare(a[0], b[0]));

        int countFleet = 0;
        double maxTime = 0.0;

        for (int i = n - 1; i >= 0; i--) {
            double time = car[i][1];
            if (time > maxTime) {
                countFleet++;
                maxTime = time; // new fleet leader
            }
        }

        return countFleet;
    }
}
