class Solution {
    private int row,col;
    private char[][] board;
    private final int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
    public void solve(char[][] board) {

        this.board=board;
        row=board.length;
        col=board[0].length;

        for(int i=0;i<row;i++){
            if(board[i][0]=='O')
            dfs(i,0);
            if(board[i][col-1]=='O')
            dfs(i,col-1);
        }
        for(int j=0;j<col;j++){
            if(board[0][j]=='O')
            dfs(0,j);
            if(board[row-1][j]=='O')
            dfs(row-1,j);
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='E') board[i][j]='O';
            }
        }

    }

    public void dfs(int r,int c){
        if(r<0 || c<0 || r>=row || c>=col) return;
        if(board[r][c]!='O') return;
        board[r][c]='E';

        for(int[] dir: dirs){
            int nr=r+dir[0];
            int nc=c+dir[1];
            dfs(nr,nc);
        }
    }
}