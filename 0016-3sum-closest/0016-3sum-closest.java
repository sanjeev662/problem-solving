class Solution {
    public int threeSumClosest(int[] nums, int realtarget) {
        int n=nums.length;
        Arrays.sort(nums);
        int closestSum=0;
        int diff=Integer.MAX_VALUE;

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])
            continue;

            int target= nums[i];

            int tempans= twoSum(nums,realtarget-target,realtarget,i+1,n-1);
            int tempdiff= Math.abs(realtarget-tempans);
            
            if(tempdiff==0) return tempans;
            else if(diff>tempdiff){
                diff=tempdiff;
                closestSum=tempans;
            }
        }
        return closestSum; 
    }

        public int twoSum(int[] nums, int target,int realtarget,int l,int r){
            int temp=Integer.MAX_VALUE;
            int tempans=0;
        while(l<r){
            if(target>nums[l]+nums[r]) {
                    if(temp>target-(nums[l]+nums[r])){
                        temp=target-(nums[l]+nums[r]);
                        tempans=nums[l]+nums[r]+(realtarget-target);
                    }
                    l++;
                }
            else if(target<nums[l]+nums[r]){
                    if(temp>(nums[l]+nums[r])-target){
                        temp=(nums[l]+nums[r])-target;
                        tempans=nums[l]+nums[r]+(realtarget-target);
                    }
                    r--;
                }
            else{
                return nums[l]+nums[r]+(realtarget-target);
            }
        }
        return tempans;
    }
}