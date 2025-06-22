class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int ans =0;
        int max=0;

        for(Integer key: map.keySet()){
            Integer value=map.get(key);
            if(max<value){
                ans=key;
                max=value;
            }
        }
    return ans;

    }
}