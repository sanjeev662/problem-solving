class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,next=0;
        while(i<nums.length){
            if(nums[i]!=val){
            nums[next]=nums[i];
            next++;}
            i++;
        }
        return next;
    }
}