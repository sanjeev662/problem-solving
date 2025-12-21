class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // double maxAverage=-Double.MAX_VALUE;
        //below correct according to standard syntax also
        double maxAverage = Double.NEGATIVE_INFINITY;

        double sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(i>=k-1){
                double average=sum/k;
                if(average>maxAverage){
                    maxAverage=average;
                }
            }

            if(i>=k-1)
            sum-=nums[i-(k-1)];
        }

        return maxAverage;
    }
}