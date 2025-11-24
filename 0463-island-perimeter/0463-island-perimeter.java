class Solution {
    public int islandPerimeter(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        boolean[][] visited = new boolean[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    return dfs(grid,visited,i,j);
                }
            }
        }
        return 0;
    }

    public int dfs(int[][] grid,boolean[][] visited,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)
        return 1;

        if(grid[i][j]==0)
        return 1;

        if(visited[i][j])
        return 0;

        visited[i][j]=true;

        int perimeter = 0;

        perimeter += dfs(grid,visited,i,j+1);
        perimeter += dfs(grid,visited,i,j-1);
        perimeter += dfs(grid,visited,i+1,j);
        perimeter += dfs(grid,visited,i-1,j);

        return perimeter;
    }
}