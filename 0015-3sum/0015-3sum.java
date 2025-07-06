class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])
            continue;

            int target= nums[i];

            twoSum(ans,nums,-target,i+1,n-1);
        }
        return ans;
    }

    public void twoSum(List<List<Integer>> ans,int[] nums, int target,int l,int r){
        while(l<r){
            if(target>nums[l]+nums[r]) l++;
            else if(target<nums[l]+nums[r]) r--;
            else{
                while(l<r && nums[l]==nums[l+1]) l++;
                while(l<r && nums[r]==nums[r-1]) r--;

                ans.add(Arrays.asList(-target,nums[l],nums[r]));
                l++;
                r--;
            }

        }
    }
}