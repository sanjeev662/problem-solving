class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        int currOccupancy = 0;

        Arrays.sort(trips, (a, b) -> a[1] - b[1]);

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[2] - b[2]);

        for (int[] current : trips) {

            while (!pq.isEmpty() && pq.peek()[2] <= current[1]) {
                int[] last = pq.poll();
                currOccupancy -= last[0];
            }

            pq.add(current);
            currOccupancy += current[0];

            if (currOccupancy > capacity) {
                return false;
            }
        }

        return true;
    }
}