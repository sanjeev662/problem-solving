class Solution {
    public String reverseWords(String s) {
        String[] ss = s.trim().split("\\s+");
        String ans="";
        for(int i=ss.length-1;i>=0;i--){
            ans=ans+ss[i];
            if(i!=0){
                ans+=" ";
            }
        }
        return ans;
    }
}