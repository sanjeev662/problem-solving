class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int min=n/3;

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int temp = entry.getValue();
            if (temp > min) {
                ls.add(entry.getKey());
            }
        }

        return ls;
    }
}