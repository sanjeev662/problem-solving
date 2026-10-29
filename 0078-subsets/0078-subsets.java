class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets=new ArrayList<>();
        subsets.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){
            int n=subsets.size();

            for(int j=0;j<n;j++){
                List<Integer> newsubset=new ArrayList<>(subsets.get(j));
                newsubset.add(nums[i]);
                subsets.add(newsubset);
            }
        }

        return subsets;
    }
}