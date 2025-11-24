class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        boolean[][] visited=new boolean[row][col];

        int maxarea=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    maxarea=Math.max(dfs(grid,visited,i,j),maxarea);
                }
            }
        }

        return maxarea;
    }

    public int dfs(int[][] grid, boolean[][] visited, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return 0;
        }

        if(grid[i][j] == 0) return 0;
        if(visited[i][j]) return 0;

        visited[i][j]=true;

        int area = 1;

        area += dfs(grid,visited,i,j+1);
        area += dfs(grid,visited,i,j-1);
        area += dfs(grid,visited,i+1,j);
        area += dfs(grid,visited,i-1,j);

        return area;
    }
}
