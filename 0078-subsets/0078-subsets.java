class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new LinkedList<>());
        int n=nums.length;

        for(int i=0;i<n;i++){          
            int j=0;
            int len=ans.size();
            while(j<len){
                List<Integer> ls=new LinkedList<>(ans.get(j));
                ls.add(nums[i]);
                ans.add(ls);
                j++;
            }
        }

        return ans;
    }
}