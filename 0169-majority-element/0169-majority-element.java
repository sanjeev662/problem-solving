class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int majority=n/2;

        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])>majority)
            return nums[i];
        }
        return nums[0];
    }
}