class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int temp=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==1){
                temp++;
            }else{
                if(temp>ans){
                    ans=temp;
                }
                temp=0;
            }
        }
        if(temp>ans)
        ans=temp;
        
        return ans;
    }
}