class Solution {
    Integer[][] dp; 
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new Integer[text1.length()][text2.length()];
        return longestCommonSub(text1,text2,0,0);
    }

    public int longestCommonSub(String s1,String s2, int i,int j){
        if(i>=s1.length() || j>=s2.length()) return 0;
        if(dp[i][j]!=null) return dp[i][j];

        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+longestCommonSub(s1,s2,i+1,j+1);
        }else{
            return dp[i][j]=Math.max(longestCommonSub(s1,s2,i,j+1),longestCommonSub(s1,s2,i+1,j));
        }
    }
}