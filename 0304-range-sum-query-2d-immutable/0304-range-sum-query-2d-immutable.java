class NumMatrix {

    public int[][] SubMatrix;
    public NumMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        SubMatrix = new int[r + 1][c + 1];

        //prefix sum in row
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }

        //prefix sum in coloumn
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }

        SubMatrix=matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int rowExtra=0,colExtra=0,common2timeRemoved=0;

        if(row1==0 && col1!=0){
            colExtra=SubMatrix[row2][col1-1];
        }else if(col1==0 && row1!=0){
            rowExtra=SubMatrix[row1-1][col2];
        }else if(col1!=0 && row1!=0){
            rowExtra=SubMatrix[row1-1][col2];
            colExtra=SubMatrix[row2][col1-1];
            common2timeRemoved=SubMatrix[row1-1][col1-1];
        }

        int sum=SubMatrix[row2][col2]-rowExtra-colExtra+common2timeRemoved;
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */