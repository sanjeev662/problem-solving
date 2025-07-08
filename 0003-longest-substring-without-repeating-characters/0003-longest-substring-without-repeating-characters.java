class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        String ans="";
        int max=0;
        for(int i=0;i<n;i++){
            char ch=(s.charAt(i));

            if(ans.contains(String.valueOf(ch))){
                max=Math.max(max,ans.length());
                ans=ans.substring(ans.indexOf(ch)+1);
            }

            ans+=ch;
        }
        return Math.max(max,ans.length());
    }
}