class Solution {
    public int countSubstrings(String s) {
        //bottom to top
        int n=s.length();

        boolean[][] dp=new boolean[n+1][n+1];
        int count=0;

        for(int l=1;l<=n;l++){
            for(int i=0;i<n+1-l;i++){
                int j=i+l-1;

                if(i==j){
                    dp[i][j]=true;
                }else if(i+1==j){
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                }else{
                    dp[i][j]=(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]);
                }

                if(dp[i][j]) count++;
            }
        }

        return count;
    }
}