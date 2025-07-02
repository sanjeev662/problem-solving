class NumMatrix {

    public int[][] SubMatrix;
    public NumMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        SubMatrix = new int[r + 1][c + 1];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                SubMatrix[i][j]=matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for(int i=row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++){
                sum+=SubMatrix[i][j];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */