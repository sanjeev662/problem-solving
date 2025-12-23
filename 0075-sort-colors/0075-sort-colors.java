class Solution {
    public void sortColors(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int i=0;

        while(i<=high){
            if(arr[i]==0){
                arr[i]=arr[low];
                arr[low]=0;
                low++;
                i++;
            }else if(arr[i]==2){
                arr[i]=arr[high];
                arr[high]=2;
                high--;
            }else{
                i++;
            }
        }
    }
}