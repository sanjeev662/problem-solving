class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1;
        int count=0;
        int i=0;

        while(i<arr.length){
            if(arr[i]!=num){
                count++;
                num++;
            }else{
                i++;
                num++;
            }

            if(count==k){
                return num-1;
            }
        }
        return num+(k-count)-1;
    }
}