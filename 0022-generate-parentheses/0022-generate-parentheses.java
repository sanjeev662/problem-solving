class Solution {


    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String curr="";
        int open=0;
        int close=0;
        solve(curr,n,ans,open,close);
        return ans;

    }
    public void solve(String curr,int n, List<String> ans,int open,int close){
        if(curr.length()==2*n){
            if(isValid(curr)) ans.add(curr);
            return;
        }
        if(open<n){
        curr+='(';
        solve(curr,n,ans,open+1,close);
        curr = curr.substring(0, curr.length() - 1);
    }
    if(open>close){
        curr+=')';
        solve(curr,n,ans,open,close+1);
        curr = curr.substring(0, curr.length() - 1);
    }
    }

    private boolean isValid(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(')
                sum++;
            else
                sum--;
            if (sum < 0)
                return false;
        }
        return sum == 0;
    }
}