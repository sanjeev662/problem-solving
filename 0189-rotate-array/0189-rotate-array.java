class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n];

        if(n<=1)
        return;

        int i=0,l=n-k%n;
        while(l<n){
            ans[i++]=nums[l++];
        }
        l=0;
        while(l<n-k%n){
            ans[i++]=nums[l++];
        }

        for(int p=0;p<n;p++)
        nums[p]=ans[p];
    }
}