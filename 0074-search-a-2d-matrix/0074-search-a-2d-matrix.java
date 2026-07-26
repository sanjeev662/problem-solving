class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;

        int n=row*col;

        int left=0;
        int right=n-1;

        while(left<=right){
            int mid=(left+right)/2;
            int i=mid/col;
            int j=mid%col;
            int indValue=matrix[i][j];

            if(indValue == target) return true;
            else if(indValue<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return false;
    }
}