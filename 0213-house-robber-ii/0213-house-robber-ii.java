class Solution {
     public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        int[] dp2=new int[n+1];
        Arrays.fill(dp2,-1);

        int case1 = solve(nums,dp, 0, n - 2);
        int case2 = solve(nums,dp2, 1, n - 1);

        return Math.max(case1, case2);
    }

    public int solve(int[] nums, int[] dp, int ind, int end){
        if(end<ind) return 0;
        if(dp[ind]!=-1) return dp[ind];

        int rob = nums[ind] + solve(nums, dp, ind + 2, end);
        int skip = solve(nums, dp, ind + 1,end);

        return dp[ind] = Math.max(rob, skip);
    }
}