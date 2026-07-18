class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        Set<Integer> setn=new HashSet<>();
        Set<Integer> setm=new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    setn.add(i);
                    setm.add(j);
                }
            }
        }

        fillNewZero(matrix,setn,setm,n,m);
    }

    public void fillNewZero(int[][] matrix,Set<Integer> setn,Set<Integer> setm, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(setn.contains(i) || setm.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}