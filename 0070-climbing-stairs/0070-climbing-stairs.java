// class Solution {
//     public int climbStairs(int n) {
//         int[] dp=new int[n+1];
//         return solve(n,dp);
//     }

//     public int solve(int n, int[] dp){
//         if(n<0) return 0;
//         if(dp[n]!=0) return dp[n];
//         if(n==0) return 1;
        
//         int step1=solve(n-1,dp);
//         int step2=solve(n-2,dp);

//         return dp[n]=step1+step2;
//     }
// }

//bottom up
class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        
        return dp[n];
    }
}