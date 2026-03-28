/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var longestOnes = function(nums, k) {
    let maxLength = 0;
    let start=0;

    for(let i=0;i<nums.length;i++){
        if(nums[i]==0) k--;

        while(k<0){
            if(nums[start]==0) k++;
            start++;
        }

        maxLength=Math.max(maxLength,i-start+1);
    }

    return maxLength;
};