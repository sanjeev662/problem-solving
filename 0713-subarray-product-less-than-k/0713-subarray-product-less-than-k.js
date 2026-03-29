/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var numSubarrayProductLessThanK = function(nums, k) {
    if (k <= 1) return 0;
    let subarray=0;
    let product=1;
    let left=0;

    for(let i=0;i<nums.length;i++){
        product*=nums[i];

        while(product>=k){
            product=product/nums[left];
            left++;
        }

        subarray+=(i-left+1);
    }

    return subarray;
};