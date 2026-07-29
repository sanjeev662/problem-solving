class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<n-3;i++){

            if(i>0){
                if(nums[i]==nums[i-1])
                continue;
            }
            
            for(int j=i+1;j<n-2;j++){
                if(j>i+1){
                    if(nums[j]==nums[j-1])
                    continue;
                }
                twoSum(nums,(long)target,i,j,ans);
            }
        }
        return ans;
    }

    public void twoSum(int[] nums,long target,int i, int j,List<List<Integer>> ans){
        int n=nums.length;
        int left=j+1;
        int right=n-1;
        while(left<right){
            long sum=(long) nums[i]+nums[j]+nums[left]+nums[right];
            if(sum==target){
                ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                left++;
                right--;

                while(left<right && nums[left]==nums[left-1]) left++;
                while(left<right && nums[right]==nums[right+1]) right--;
            }
            else if(sum>target){
                right--;
            }else{
                left++;
            }            
        }
    }
}