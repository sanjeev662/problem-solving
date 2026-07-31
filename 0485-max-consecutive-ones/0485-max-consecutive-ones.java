class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0;        
        int temp=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                temp++;
            }else{
                max=Math.max(temp,max);
                temp=0;
            }
        }
        max=Math.max(temp,max);
        return max;
    }
}