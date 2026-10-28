class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int i=0;
        while (i < n) {
            int index = nums[i];

            if (nums[i] < n && nums[i] != nums[index]) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

         for (int j = 0; j < n; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        return n;
    }
}