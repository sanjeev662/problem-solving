class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        
        int product=1;
        int start=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            product=product*nums[i];

            while(product>=k){
                product=product/nums[start];
                start++;
            }

            count+=i-start+1;
        }
        return count;
    }
}