class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // int mincost=cost[0]>=cost[1] ? cost[1]: cost[0];
        // int start=cost[0]>=cost[1] ? 1:0;
        // int i=start;
        // int n=cost.length;

        // while(i<n-2){
        //     int tempmincost=cost[i+1]>=cost[i+2] ? cost[i+2]: cost[i+1];
        //     mincost+=tempmincost;
        //     int next=cost[i+1]>=cost[i+2] ? i+2:i+1;
        //     i=next;
        // }

        // return mincost;

        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost,dp,0),solve(cost,dp,1));
    }

    public int solve(int[] cost,int[] dp, int ind){
        if(ind>=cost.length) return 0;
        if(dp[ind]!=-1) return dp[ind];
        return dp[ind] = cost[ind]+Math.min(solve(cost,dp,ind+1),solve(cost,dp,ind+2));
    }
}