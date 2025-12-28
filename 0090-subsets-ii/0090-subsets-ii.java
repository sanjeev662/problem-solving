class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        Arrays.sort(nums);

        int start=0;
        int end=ans.size();

        for(int i=0;i<nums.length;i++){
            start=0;

            if(i>0 && nums[i]==nums[i-1]){
                start=end;
            }
            end=ans.size();

            for(int j=start;j<end;j++){
                List<Integer> ls=new ArrayList<>(ans.get(j));
                ls.add(nums[i]);
                ans.add(ls);
            }
        }
        return ans;
    }
}