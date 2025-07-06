class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-3;i++){
            if(i!=0 && nums[i]==nums[i-1])
            continue;

            for(int j=i+1;j<n-2;j++){
                if(j!=i+1 && nums[j]==nums[j-1])
                continue;
                
                int l=j+1;
                int r=n-1;

                while(l<r){
                    long temp=nums[i]+nums[j];
                    temp+=nums[l];
                    temp+=nums[r];

                    if(target<temp) r--;
                    else if(target>temp) l++;
                    else{
                        while(l<r && nums[l]==nums[l+1]) l++;
                        while(l<r && nums[r]==nums[r-1]) r--;

                        ans.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                    }
                }
            }
        }

        return ans;
    }
}