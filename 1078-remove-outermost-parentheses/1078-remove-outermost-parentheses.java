class Solution {
    public String removeOuterParentheses(String s) {
        String result="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                if(count>=2){
                    result+='(';
                }
            }else{
                count--;
                if(count>=1){
                    result+=')';
                }
            }
        }

        return result;
    }
}