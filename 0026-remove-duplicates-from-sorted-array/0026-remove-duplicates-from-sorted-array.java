class Solution {
    public int removeDuplicates(int[] nums) {
        int ind=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            nums[ind]=nums[i];
            ind++;
        }
        return ind;
    }
}