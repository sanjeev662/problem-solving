class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length+nums2.length;
        int m=nums1.length;
        int n=nums2.length;

        int[] arr=new int[l];
        int i=0,j=0,k=0;

        while(i<m || j<n){
            if(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    arr[k++]=nums1[i++];
                }else{
                    arr[k++]=nums2[j++];
                }
            }else if(i<m){
                arr[k++]=nums1[i++];
            }else{
                arr[k++]=nums2[j++];
            }
        }
        if (l % 2 == 0) {
            return (arr[l / 2] + arr[(l / 2) - 1]) / 2.0;
        }
        return arr[l / 2];    
    }
}