/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let ind=0;

    for(let i=1;i<nums.length;i++){
        if(nums[ind]!=nums[i]){
            ind++;
            nums[ind]=nums[i];
        }
    }
    return ind+1;
};