class Solution {
    public String simplifyPath(String path) {
        String[] arr= path.split("/+");

        Stack<String> st=new Stack<>();
        int n=arr.length;
        if(n==1) return "/";

        for(int i=1;i<n;i++){
            if(arr[i].equals(".")) continue;
            else if(arr[i].equals("..")){ if(!st.isEmpty()) st.pop(); }
            else st.push(arr[i]);
        }

        String ans="";
        int k=0;
        while(!st.isEmpty()){
            String pp=st.pop();
            ans="/"+pp+ans;
        }
        if(ans.equals("")) return "/";
        return ans;
    }
}