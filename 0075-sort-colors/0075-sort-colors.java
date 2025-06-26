class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0;
        for(int i=0;i<nums.length;i++){
            switch (nums[i]){
                case 0:
                    zero++;
                    break;
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                default:
            }
        }
        int i=0;
        while(i<nums.length){
            while(zero>0){
                nums[i++]=0;
                zero--;
            }
            while(one>0){
                nums[i++]=1;
                one--;
            }
            while(two>0){
                nums[i++]=2;
                two--;
            } 
        }
    }
}