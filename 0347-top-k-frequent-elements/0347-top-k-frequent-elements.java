import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Frequency Map
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Min-Heap storing Map.Entry (key: number, value: frequency)
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue() // Min-Heap by frequency
        );
        
        // Add entries to heap
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            heap.add(entry);
            if (heap.size() > k) {
                heap.poll(); // Remove least frequent
            }
        }
        
        // Prepare result
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = heap.poll().getKey();
        }
        
        return res;
    }
}
