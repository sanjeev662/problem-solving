class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        int[] ans=new int[2];

        while(l<r){
            int temp= numbers[l]+numbers[r];
            if(temp==target)
            {
                ans[0]=l+1;
                ans[1]=r+1;
                return ans;
            }else if(temp>target){
                r--;
            }else if(temp<target){
                l++;
            }
        }
        return ans;       
    }
}