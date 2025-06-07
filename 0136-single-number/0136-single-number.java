class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int temp=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
i++;
            }
            else
            {
                ans=nums[i];
                break;
            }
        }

        if(ans==0 && nums.length>1 && nums[nums.length-1]!=nums[nums.length-2]){
            ans=nums[nums.length-1];
        }

        if(nums.length==1)
        ans=nums[0];

        return ans;

    }
}