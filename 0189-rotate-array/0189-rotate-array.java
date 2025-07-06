class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int m=k%n;

        reverse(nums,0,n-1);
        reverse(nums,0,m-1);
        reverse(nums,m,n-1);       
    }

    public void reverse(int[] nums,int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}