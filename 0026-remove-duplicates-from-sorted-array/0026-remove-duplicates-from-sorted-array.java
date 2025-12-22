class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,nonduplicate=1;

        while(i<nums.length){
            if(nums[nonduplicate-1]!=nums[i]){
                nums[nonduplicate]=nums[i];
                nonduplicate++;
            }
            i++;
        }

        return nonduplicate;
    }
}