class Solution {
    public int missingNumber(int[] nums) {
        // first can sort using cyclic sort approach

        int i=0;
        int n=nums.length;

        while(i<nums.length){
            if(nums[i]!=i && nums[i]<n){
                int temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }else{
                i++;
            }
        }

        for(int j=0;j<n;j++){
            if(nums[j]!=j) return j;
        }

        return n;

    }
}