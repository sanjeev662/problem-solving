class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=i;j<n;j++){
                if(i==j) temp=nums[j];
                else temp+=nums[j];
                if(temp==k){
                    count++;
                }
            }
        }
        return count;
    }
}