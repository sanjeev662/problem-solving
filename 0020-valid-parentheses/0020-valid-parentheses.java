class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new  Stack<Character>();
        for(char ch : s.toCharArray()){
            if(ch==')' && !st.isEmpty() && st.peek()=='(') st.pop();
            else if(ch=='}' && !st.isEmpty() && st.peek()=='{') st.pop();
            else if(ch==']' && !st.isEmpty() && st.peek()=='[') st.pop();
            else st.push(ch);
        }
        if(st.isEmpty()) return true;
        return false;
    }
}