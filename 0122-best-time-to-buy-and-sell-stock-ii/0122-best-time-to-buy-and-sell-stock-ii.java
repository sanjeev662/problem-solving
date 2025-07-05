class Solution {
    public int maxProfit(int[] prices) {
        int max=0;

        if(prices.length<=1){
            return 0;
        }

        for(int i=1;i<prices.length;i++){
            int temp=prices[i]-prices[i-1];

            if(temp>0)
            max+=temp;
        }

        return max;
    }
}