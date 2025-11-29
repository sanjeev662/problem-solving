class Solution {
    private int row, col;
    private int[][] heights;
    private final int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights=heights;
        List<List<Integer>> ans=new ArrayList<>();

        row=heights.length;
        col=heights[0].length;

        if(row==0) return ans;

        boolean[][] pac=new boolean[row][col];
        boolean[][] atla=new boolean[row][col];

        for(int i=0;i<row;i++){
            dfs(0,i,pac);
            dfs(col-1,i,atla);
        }
        for(int j=0;j<col;j++){
            dfs(j,0,pac);
            dfs(j,row-1,atla);
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(pac[i][j] && atla[i][j])
                {
                    ans.add(Arrays.asList(i,j));
                }
            }
        }

        return ans;
    }

    public void dfs(int c,int r,boolean[][] visited){
        if(visited[r][c]) return;
        visited[r][c]=true;

        for(int[] dir : dirs){
            int nr=r+dir[0];
            int nc=c+dir[1];

            if(nr<0 || nc<0 || nr>=row || nc>=col) continue;
            else if(!visited[nr][nc] && heights[nr][nc]>=heights[r][c]){
                dfs(nc,nr,visited);
            }
        }

    }
}