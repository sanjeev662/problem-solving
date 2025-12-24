class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        int n=nums.length;

        while(i<n){
            int correctInd=nums[i]-1;

            if(nums[correctInd]!=nums[i]){
                int temp=nums[correctInd];
                nums[correctInd]=nums[i];
                nums[i]=temp;
            }else if(nums[correctInd]==nums[i] && correctInd!=i){
                return nums[i] ;
            }else{
                i++;
            }
        }
        return n;
    }
}