class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minLength=n+2;

        int windowstart=0;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];

            // if(sum>=target){
                while(target<=sum){
                    minLength=Math.min(minLength,i-windowstart+1);
                    sum-=nums[windowstart];
                    windowstart++;
                }
            // }
        }

        if(minLength==n+2) return 0;
        return minLength;
    }
}