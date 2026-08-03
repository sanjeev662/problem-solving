class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();


        backtrack(0, nums, temp, ans);

        return ans;
    }

    public void backtrack(int start,int[] nums,List<Integer> temp, List<List<Integer>> ans){

        ans.add(new ArrayList<>(temp));
        
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;

            // Choose
            temp.add(nums[i]);

            // Explore
            backtrack(i + 1, nums, temp, ans);

            // Undo (Backtrack)
            temp.remove(temp.size() - 1);
        }
    }
}