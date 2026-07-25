class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr1pointer=m-1;
        int arr2pointer=n-1;
        int ind=m+n-1;

        while(arr1pointer>=0 && arr2pointer>=0){
            if(nums1[arr1pointer]<=nums2[arr2pointer]){
                nums1[ind]=nums2[arr2pointer];
                ind--;
                arr2pointer--;
            }else{
                nums1[ind]=nums1[arr1pointer];
                ind--;
                arr1pointer--;        
            }
        }

        while(arr1pointer>=0){
            nums1[ind]=nums1[arr1pointer];
            arr1pointer--;
            ind--;
        }

        while(arr2pointer>=0){
            nums1[ind]=nums2[arr2pointer];
            arr2pointer--;
            ind--;
        }
    }
}