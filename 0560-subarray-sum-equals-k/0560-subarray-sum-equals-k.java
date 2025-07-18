class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count=0;
        // int n=nums.length;

        // for(int i=0;i<n;i++){
        //     int temp=0;
        //     for(int j=i;j<n;j++){
        //         if(i==j) temp=nums[j];
        //         else temp+=nums[j];
        //         if(temp==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int count=0;
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];

            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}