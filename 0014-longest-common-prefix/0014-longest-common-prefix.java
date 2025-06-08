class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common="";
        int shortl = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(shortl > strs[i].length()){
                shortl=strs[i].length();
            }
        }
        int j=0;
        while(j<shortl){
            char t=strs[0].charAt(j);
            for(int i=0;i<strs.length;i++){
                if(t!=strs[i].charAt(j)){
                    return common;
                }
            }
            common+=t;
            j++;
        }
        return common;
    }
}