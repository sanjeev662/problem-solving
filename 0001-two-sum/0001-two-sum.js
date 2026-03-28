/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let mp=new Map();
    let ans = new Array(2).fill(0);

    for(let i=0;i<nums.length;i++){
        if(mp.has(target-nums[i])){
            ans[0]=mp.get(target-nums[i]);
            ans[1]=i;
            return ans;
        }
        mp.set(nums[i],i);
    }
    return ans;
};