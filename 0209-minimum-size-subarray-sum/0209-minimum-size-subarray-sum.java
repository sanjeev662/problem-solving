class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minLength=Integer.MAX_VALUE;
        int left=0;

        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];

            while(sum>=target){
                minLength=Math.min(minLength,i-left+1);
                sum=sum-nums[left];
                left++;
            }
        }

        if(minLength>n) return 0;
        return minLength;
    }
}