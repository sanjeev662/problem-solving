class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return solve(nums,dp,0);
    }

    public int solve(int[] nums, int[] dp, int ind){
        if(nums.length<=ind) return 0;
        if(dp[ind]!=-1) return dp[ind];

        int rob = nums[ind] + solve(nums, dp, ind + 2);
        int skip = solve(nums, dp, ind + 1);

        return dp[ind] = Math.max(rob, skip);
    }
}