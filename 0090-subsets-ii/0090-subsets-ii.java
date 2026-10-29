class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets=new ArrayList<>();
        subsets.add(new ArrayList<>());

        int end=0;
        for(int i=0;i<nums.length;i++){
            int start=0;

            if(i>0 && nums[i]==nums[i-1])
            {
                start=end;
            }

            end=subsets.size();

            for(int j=start;j<end;j++){
                List<Integer> newsubset=new ArrayList<>(subsets.get(j));
                newsubset.add(nums[i]);
                subsets.add(newsubset);
            }
        }

        return subsets;
    }
}