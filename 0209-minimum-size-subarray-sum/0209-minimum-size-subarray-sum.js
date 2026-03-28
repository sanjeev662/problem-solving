/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(target, nums) {
    let l=0;
    let r=0;
    let minLength=Infinity;
    let sum=0;

    while(r<nums.length){
        sum+=nums[r];

        while(sum>=target && l<=r){
            minLength=Math.min(minLength,r-l+1);
            sum-=nums[l];
            l++;
        }
        r++;
    }

    if(minLength == Infinity) return 0;
    return minLength;
};