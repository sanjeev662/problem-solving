import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int pile : piles) {
            if (pile > maxPile) {
                maxPile = pile;
            }
        }
        
        int l = 1; // Minimum possible eating speed
        int r = maxPile; // Maximum possible eating speed

        int minK = maxPile;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            // Step 3: Use the helper method to check if Koko can finish within 'h' hours
            // with the current 'mid' speed.
            if (timeToEatAllPiles(piles, mid) <= h) {
                // If Koko can finish within 'h' hours with 'mid' speed,
                // 'mid' is a possible answer. We try to find a smaller speed.
                minK = mid;
                r = mid - 1;
            } else {
                // If 'mid' speed is too slow (takes more than 'h' hours),
                // we need a faster speed.
                l = mid + 1;
            }
        }
        return minK;
    }

    private long timeToEatAllPiles(int[] piles, int k) {
        long hoursTaken = 0;
        for (int pile : piles) {
            // For each pile, calculate hours using ceil(pile / k)
            // (pile + k - 1) / k is a common integer trick for ceiling division.
            hoursTaken += (long) (pile + k - 1) / k;
        }
        return hoursTaken;
    }
}