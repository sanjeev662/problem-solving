class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;

        // Step 1: Find longest sorted prefix
        int left = 0;
        while (left + 1 < n && arr[left] <= arr[left + 1]) {
            left++;
        }

        // Already sorted
        if (left == n - 1) return 0;

        // Step 2: Find longest sorted suffix
        int right = n - 1;
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }

        // Step 3: Remove either prefix or suffix completely
        int ans = Math.min(n - left - 1, right);

        // Step 4: Try merging prefix & suffix
        int i = 0, j = right;
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                ans = Math.min(ans, j - i - 1);
                i++;
            } else {
                j++;
            }
        }

        return ans;
    }
}
