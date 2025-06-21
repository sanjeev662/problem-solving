class Solution {
    public int[] getConcatenation(int[] nums) {
       int[] arr=new int[2*nums.length];
       int j=0,n=0;
       while(n<2){
        for(int i=0;i<nums.length;i++)
        arr[j++]=nums[i];
        n++;
       } 
       return arr;
    }
}