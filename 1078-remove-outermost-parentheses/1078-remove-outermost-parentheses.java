class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String result="";

        for(int i=0;i<s.length();i++){
        if (!st.isEmpty()){
            if(((st.peek() == '(' && s.charAt(i) == '(') || 
                (st.peek() == ')' && s.charAt(i) == ')'))) {
                st.push(s.charAt(i));
                result+=s.charAt(i);
            }else{
                char temp=st.pop();
                if(!st.isEmpty()){
                    result+=s.charAt(i);
                    
                }
            }
        }
        else{
            st.push(s.charAt(i));
        }}
        return result;
    }
}