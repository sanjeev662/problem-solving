class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(
        (a, b) -> {
            int diff = Math.abs(b - x) - Math.abs(a - x);
            if (diff == 0) return b - a;
            return diff;
            }
        );

        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);

            if(pq.size()>k)
            pq.poll();
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(pq.poll());
        }
        Collections.sort(ans);
        return ans;
    }
}