class Solution {


    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String curr="";
        solve(curr,n,ans);
        return ans;

    }
    public void solve(String curr,int n, List<String> ans){
        if(curr.length()==2*n){
            if(isValid(curr)) ans.add(curr);
            return;
        }
        curr+='(';
        solve(curr,n,ans);
        curr = curr.substring(0, curr.length() - 1);
        curr+=')';
        solve(curr,n,ans);
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