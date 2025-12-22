class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets=new ArrayList<>();

        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(i!=0){
                if(nums[i-1]==nums[i])
                continue;
            }
            findtriplet(nums,-nums[i],i+1,triplets);           
        }
        return triplets;
    }

    public void findtriplet(int[] nums, int target, int ind,List<List<Integer>> triplets){
        int start=ind;
        int end=nums.length-1;

        while(start<end){
            if(nums[start]+nums[end]>target){
                end--;
            }else if(nums[start]+nums[end]<target){
                start++;
            }else{
                triplets.add(Arrays.asList(-target, nums[start], nums[end]));
                end--;
                start++;
                while (start < end && nums[start] == nums[start - 1]) {
                    start++;
                }
                while (start < end && nums[end] == nums[end + 1]) {
                    end--;
                }
            }
        }
    }
}