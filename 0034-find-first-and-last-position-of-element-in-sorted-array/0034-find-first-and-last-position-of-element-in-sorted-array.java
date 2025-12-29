class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        int n=nums.length;
        int l=0,r=n-1;
        int start=-1,end=-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(nums[mid]<target){
                l=mid+1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                start = mid;
                while (start - 1 >= 0 && nums[start - 1] == target) {
                    start--;
                }
                end = mid;
                while (end + 1 < n && nums[end + 1] == target) {
                    end++;
                }
                break;
            }
        }

        arr[0]=start;
        arr[1]=end;

        return arr;
    }
}