class Solution {
    public String longestPalindrome(String s) {
        int maxLength=0;
        int startInd=0;
        int n=s.length();

        int[][] dp=new int[n+1][n+1];
        //consider 0 not approached, 1 true, 2 false

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindromic(s,i,j,dp)){
                    int len=j-i;
                    if(len > maxLength){
                        maxLength=len;
                        startInd=i;
                    }
                }
            }
        }
        return s.substring(startInd,startInd+maxLength+1);
    }

    public boolean isPalindromic(String s,int i,int j,int[][] dp){
        if(i>=j) return true;

        if(dp[i][j]!=0) return dp[i][j]==1?true:false;

        if(s.charAt(i)==s.charAt(j))
        {
          boolean temp=isPalindromic(s,i+1,j-1,dp);
            dp[i][j]= temp?1:2;
          return temp;
        }

        dp[i][j]=2;
        return false;
    }
}