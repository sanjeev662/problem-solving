class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        int n=strs.length;
        int j=strs[0].length();
        int k=strs[n-1].length();

        while(i<j && i<k){
            if(strs[0].charAt(i)!=strs[n-1].charAt(i)){
                return strs[0].substring(0,i);
            }
            i++;
        }
        return strs[0].substring(0,i);
    }
}