class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;

        double sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }

        double maxAvg=sum/k;

        for(int i=k;i<n;i++){
            sum=sum+(nums[i]-nums[i-k]);
            maxAvg=Math.max(maxAvg,sum/k);
        }
        return maxAvg;
    }
}