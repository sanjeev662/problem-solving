class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int fresh=0;

        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0) return 0;
        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        int time=-1;

        while(!q.isEmpty()){
            int size=q.size();
            time++;

            while(size-->0){
            int[] temp=q.poll();
            int trow=temp[0];
            int tcol=temp[1];

                for(int[] dir: dirs){
                    int ttrow=trow+dir[0];
                    int ttcol=tcol+dir[1];

                    if(ttrow>=0 && ttcol>=0 && ttrow<row && ttcol<col && grid[ttrow][ttcol]==1){
                        grid[ttrow][ttcol]=2;
                        fresh--;
                        q.offer(new int[]{ttrow,ttcol});
                    }
                }
            }
        }

        return fresh==0?time:-1;
    }
}