class Solution {
    public int majorityElement(int[] nums) {
        return majorityElementByMap(nums);
        // return majorityElementBySort(nums);
    }

    public int majorityElementByMap(int[] nums) {
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


    public int majorityElementBySort(int[] nums) {
        int ans=-1;
        int max=1;
        int n= nums.length;
        if(n==1){
            return nums[0];
        }
        int m=n/2;


        Arrays.sort(nums);

        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                max++;
            }
            else{
                max=1;
            }

            if(max>n/2)
            {
                return nums[i];
            }
        }

        return ans;
    }
}