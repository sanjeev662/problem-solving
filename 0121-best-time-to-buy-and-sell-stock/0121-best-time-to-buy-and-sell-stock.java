class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;
        int n=prices.length;

        for(int i=0;i<n;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            int diff=prices[i]-min;
            if(max<diff)
            max=diff;
        }

        return max;
    }
}