class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);  // Add all numbers to the set

        int maxLen = 0;
        
        for (int num : set) {
            // Only start counting if num is the beginning of a sequence
            if (!set.contains(num - 1)) {
                int curr = num;
                int len = 1;
                
                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                
                maxLen = Math.max(maxLen, len);
            }
        }
        
        return maxLen;
    }
}
