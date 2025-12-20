class Solution {
    public String longestPalindrome(String s) {
        int maxLength=0;
        int startInd=0;
        int n=s.length();

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindromic(s,i,j)){
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

    public boolean isPalindromic(String s,int i,int j){
        if(i>=j) return true;

        if(s.charAt(i)==s.charAt(j))
        {
            return isPalindromic(s,i+1,j-1);
        }

        return false;
    }
}