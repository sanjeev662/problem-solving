class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        Integer[][] temp=new Integer[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]!=0){
                    if(temp[i][j]==null)
                    temp[i][j]=matrix[i][j];
                }else{
                    fillNewZero(temp,i,j,n,m);
                }
            }
        }

        clone(matrix,temp,n,m);
    }

    public void fillNewZero(Integer[][] temp,int ii,int jj, int nn, int mm){
        for(int i=0;i<nn;i++){
            for(int j=0;j<mm;j++){
                if(i==ii || j==jj){
                    temp[i][j]=0;
                }
            }
        }
    }

    public void clone(int[][] matrix,Integer[][] temp,int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                    matrix[i][j]=temp[i][j];
            }
        }
    }
}