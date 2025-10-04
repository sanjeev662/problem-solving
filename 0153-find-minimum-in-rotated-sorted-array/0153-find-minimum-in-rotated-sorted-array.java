class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int mini=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mini>nums[mid])
            mini=nums[mid];

            if(nums[mid]>=nums[r]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return mini;
    }
}