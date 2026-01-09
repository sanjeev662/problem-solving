class Solution {
    static Boolean memo[][];
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        if(sum%2!=0) return false;

        int target=sum/2;
        memo=new Boolean[n][target+1];

        return isSubsetPresent(nums,0,target);
    }

    public boolean isSubsetPresent(int[] nums,int ind,int target){
        if(target==0) return true;
        if(target<0) return false;
        if(ind>nums.length-1) return false;

        if(memo[ind][target]!=null) return memo[ind][target];

        Boolean take=isSubsetPresent(nums,ind+1,target-nums[ind]);
        Boolean nonTake=isSubsetPresent(nums,ind+1,target);

        return memo[ind][target]=take||nonTake;
    }
}