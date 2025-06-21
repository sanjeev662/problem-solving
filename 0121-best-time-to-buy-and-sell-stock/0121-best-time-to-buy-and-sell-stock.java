class Solution {
    public int maxProfit(int[] prices) {
        int i=0,maxp=0,buy=prices[0], n=prices.length;
        while(i<n){
            if(buy>prices[i])
            {
                buy=prices[i];
            }
            int p=prices[i]-buy;
            if(maxp<p)
            maxp=p;
            i++;
        }
        return maxp;
    }
}