class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;

        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else{
                return (checkPalindrome(s,l+1,r) || checkPalindrome(s,l,r-1));
            }
        }
        return true;
    }

    public boolean checkPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)==s.charAt(r))
            {
                l++;
                r--;
            }else
            return false;
        }
        return true;
    }
}