class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        int end=0;
        long sum=0;
        long maxsum=Long.MIN_VALUE;;
        while(end<nums.length){
            sum+=nums[end++];
            if(end-start>k){
                sum-=nums[start];
                start++;
            }

            if (end - start == k) {
                maxsum=Math.max(maxsum,sum);
            }
        }
        return (double)maxsum/k;
    }
}