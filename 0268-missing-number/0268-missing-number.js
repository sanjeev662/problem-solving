/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let i = 0;
    let n = nums.length;

    while (i < n) {
        if (nums[i] < n && nums[i] !== nums[nums[i]]) {
            let correctIndex = nums[i];
            [nums[i], nums[correctIndex]] = [nums[correctIndex], nums[i]];
        } else {
            i++;
        }
    }

    for (let i = 0; i < n; i++) {
        if (nums[i] !== i) return i;
    }

    return n;
};