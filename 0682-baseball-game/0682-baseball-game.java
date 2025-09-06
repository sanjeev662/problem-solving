class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<op.length;i++){
            if(op[i].equals("+")){
                int ii=st.pop();
                int sum=ii+st.peek();
                st.push(ii);
                st.push(sum);

            }else if(op[i].equals("D")){
                st.push(st.peek()*2);
            }else if(op[i].equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(op[i]));
            }
        }
        int ans=0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        return ans;
    }
}