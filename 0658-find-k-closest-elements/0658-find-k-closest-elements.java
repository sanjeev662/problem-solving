// class Solution {
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {

//         PriorityQueue<Integer> pq = new PriorityQueue<>(
//         (a, b) -> {
//             int diff = Math.abs(b - x) - Math.abs(a - x);
//             if (diff == 0) return b - a;
//             return diff;
//             }
//         );

//         for(int i=0;i<arr.length;i++){
//             pq.offer(arr[i]);

//             if(pq.size()>k)
//             pq.poll();
//         }

//         List<Integer> ans = new ArrayList<>();
//         for(int i=0;i<k;i++){
//             ans.add(pq.poll());
//         }
//         Collections.sort(ans);
//         return ans;
//     }
// }

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
