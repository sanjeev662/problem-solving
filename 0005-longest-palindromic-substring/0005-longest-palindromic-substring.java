class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<=1) return s;

        int max=0;
        String ans=""+s.charAt(0);

        for(int i=0;i<n;i++){
            int j=i;
            int k=i;
            while(j>=0 && k<n && s.charAt(j)==s.charAt(k)){
                int diff=k-j;
                if(diff>max){
                    max=diff;
                    ans=s.substring(j,k+1);
                }
                j--;
                k++;
            }

            j=i;
            k=i+1;
            while(j>=0 && k<n && s.charAt(j)==s.charAt(k)){
                int diff=k-j;
                if(diff>max){
                    max=diff;
                    ans=s.substring(j,k+1);
                }
                j--;
                k++;
            }
        }
        return ans;
    }
}