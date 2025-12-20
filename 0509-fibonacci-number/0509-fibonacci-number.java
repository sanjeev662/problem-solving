class Solution {
    public int fib(int n) {
        if(n<=1) return n;

        int prev0=0;
        int prev1=1;
        int prev=n;

        for(int i=2;i<=n;i++){
            prev=prev0+prev1;
            prev0=prev1;
            prev1=prev;
        }

        return prev;
    }
}