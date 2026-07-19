class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=0;
        int tempsum=0;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max=nums[i];
            tempsum=tempsum+nums[i];
            if(tempsum>0){
                if(tempsum>maxsum) maxsum=tempsum;
            }else{
                tempsum=0;
            }           
        }
        if(maxsum==0) return max;
        return maxsum;
    }
}