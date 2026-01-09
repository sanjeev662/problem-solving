class Solution {
    int[][] memo;
    public int coinChange(int[] coins, int amount) {
        memo=new int[coins.length][amount+1];
        int res=minimumCoins(coins,coins.length-1,amount);
        return res==Integer.MAX_VALUE ? -1 : res;
    }

    public int minimumCoins(int[] coins,int ind,int amount){
        if(amount<0 || ind<0) return Integer.MAX_VALUE;
        int val=coins[ind];
        if(amount==0) return 0;
        if(memo[ind][amount]!=0) return memo[ind][amount];

        int take=Integer.MAX_VALUE;

        if(amount>=val){
        int subtake=minimumCoins(coins,ind,amount-val);
        if(subtake!=Integer.MAX_VALUE){
            take=subtake+1;
        }
        }
        int skip=minimumCoins(coins,ind-1,amount);

        return memo[ind][amount]=Math.min(take,skip);
    }
}