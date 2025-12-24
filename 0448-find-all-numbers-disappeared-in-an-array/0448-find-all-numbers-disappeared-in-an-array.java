class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        int n = nums.length;

        // Step 1: Try to place each number at its correct index
        while (i < n) {

            // nums[i] should be at index nums[i] - 1
            int correctIndex = nums[i] - 1;

            /*
             WHY this condition?
             -------------------
             If nums[i] is NOT already at its correct index,
             and the target index does NOT already contain the same value,
             then we should swap.

             WHY NOT check nums[i] != i ?
             ----------------------------
             Because duplicates exist.
             We only care whether nums[i] is at its correct place,
             NOT whether index matches value.
            */
            if (nums[i] != nums[correctIndex]) {
                // swap nums[i] with nums[correctIndex]
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                // either already correct OR duplicate blocks further movement
                i++;
            }
        }

        // Step 2: Any index where value != index+1 → missing number
        List<Integer> result = new ArrayList<>();

        for (int index = 0; index < n; index++) {
            /*
             WHY index + 1 ?
             --------------
             Because index 0 expects 1
             index 1 expects 2
             ...
            */
            if (nums[index] != index + 1) {
                result.add(index + 1);
            }
        }

        return result;
    }
}
