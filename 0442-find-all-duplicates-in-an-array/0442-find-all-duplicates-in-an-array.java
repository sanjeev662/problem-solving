class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        int n=nums.length;
        List<Integer> ls=new ArrayList<>();

        while(i<n){
            int correctedInd=nums[i]-1;

            if(nums[i]!=nums[correctedInd]){
                int temp=nums[i];
                nums[i]=nums[correctedInd];
                nums[correctedInd]=temp;
            }
            // else if(nums[i]==nums[correctedInd] && i!=correctedInd){
            //     if(!ls.contains(nums[i])){
            //         ls.add(nums[i]);
            //     }
            //     i++;
            // }
            else{
                i++;
            }
        }

        // // above commented solution was good (because that able to handle multiple appearance) but in some cases that lead to n square time compelexity ,
        // contains() time complexity is O(n)..

        //for atmost twice case only
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                ls.add(nums[j]);
            }
        }
        return ls;
    }
}