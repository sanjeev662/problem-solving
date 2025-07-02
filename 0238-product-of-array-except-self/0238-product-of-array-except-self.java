class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multi=1;
        boolean isZero=false;
        boolean isNonZero=false;
        boolean isDoubleZero=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            multi*=nums[i];
            isNonZero=true;
            }
            else if(isZero){
                isDoubleZero=true;
            }
            else
            isZero=true;
        }

        for(int i=0;i<nums.length;i++){
            if(isNonZero && !isDoubleZero){
            if(isZero && nums[i]!=0)
            {
                nums[i]=0;
            }
            else if(nums[i]==0)
            {
                nums[i]=multi;
            }else{
                nums[i]=multi/nums[i];
            }}else{
                nums[i]=0;
            }
        }

        return nums;

    }
}