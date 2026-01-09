class Solution {
    Integer[][] dp;

    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        dp=new Integer[n][n];
        return longestPalindrome(s,0,n-1);
    }

    public int longestPalindrome(String s,int left,int right){
        if(left>right) return 0;
        if(left==right) return 1;

        if(dp[left][right]!=null) return dp[left][right];

        if(s.charAt(left)==s.charAt(right)){
            return dp[left][right]=2+longestPalindrome(s,left+1,right-1);
        }else{
            return dp[left][right]=Math.max(longestPalindrome(s,left,right-1),longestPalindrome(s,left+1,right));
        }
    }
}