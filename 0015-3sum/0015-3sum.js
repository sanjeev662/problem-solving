/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    let triplet=[];
    nums.sort((a, b) => a - b);

    for(let i=0;i<nums.length;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        findtriplet(nums,triplet,i+1,-nums[i]);
    }

    return triplet;
};

function findtriplet(nums,triplet,ind,target){
    let start=ind;
    let end=nums.length-1;

    while(start<end){
        if(nums[start]+nums[end]>target){
            end--;
        }else if(nums[start]+nums[end]<target){
            start++;
        }else{
            triplet.push([-target,nums[start],nums[end]]);
            start++;
            end--;
            while(start<end && nums[start]==nums[start-1]){
                start++;
            }
            while(start<end && nums[end]==nums[end+1]){
                end--;
            }
        }
    }
}