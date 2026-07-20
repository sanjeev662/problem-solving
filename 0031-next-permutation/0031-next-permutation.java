class Solution {
    public void nextPermutation(int[] nums) {
        boolean done=false;
        int n=nums.length;
        int pivot=n-1;
        
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                done=true;
                break;
            }
        }

        if(!done){
              reverse(nums, 0, n - 1);
        }else{

            int justbignumidx = n - 1;
            while (nums[justbignumidx] <= nums[pivot]) {
                    justbignumidx--;
            }

              int temp=nums[justbignumidx];
               nums[justbignumidx]=nums[pivot];
               nums[pivot]=temp;

               reverse(nums,pivot+1,n-1);
        }
    }

    public static void reverse(int[] nums, int left, int right) {
    while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }
}
}