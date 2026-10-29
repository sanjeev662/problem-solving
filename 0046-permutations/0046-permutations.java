class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        ans.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){
            List<List<Integer>> temp=new ArrayList<>();

            for(List<Integer> ansval: ans){
                int n=ansval.size();

                for(int j=0;j<=n;j++){
                    List<Integer> newval=new ArrayList<>(ansval);
                    newval.add(j,nums[i]);
                    temp.add(newval);
                }
            }

            ans=temp;
        }

        return ans;
    }
}