class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If duplicate exists within the window
            if (set.contains(nums[i])) {
                return true;
            }
            
            set.add(nums[i]);
            
            // Maintain window size of at most k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}
