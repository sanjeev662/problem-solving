class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<as.length;i++){
            int asteroid=as[i];
            boolean destroy=false;

            while(!st.isEmpty() && st.peek()>0 && asteroid<0){
 
                int ast=Math.abs(asteroid);
                if(st.peek()<ast){
                    st.pop();
                    continue;
                }else if(st.peek()==ast){
                    st.pop();
                }
                destroy=true;
                break;
            }

            if(!destroy){
                st.push(asteroid);
            }
        }

        int l=st.size()-1;
        int[] ans=new int[l+1];
        while(!st.isEmpty()){
            ans[l--]=st.pop();
        }
        return ans;
    }
}