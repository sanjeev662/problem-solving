class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        int max=0;

        for(int num : set){
            if(!set.contains(num-1)){
                int curr=num;
                int l=0;
                while(set.contains(curr)){
                    curr++;
                    num++;
                    l++;
                }
                if(l>max){
                    max=l;
                }
            }
        }
        return max;
    }
}
