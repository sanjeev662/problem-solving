class Solution {
    public int countGoodNumbers(long n) {
        long ans = (long)((power(5,(n+1)/2)*power(4,n/2))%1000000007);
        return (int)(ans);
    }

    public long power(long a,long b){
        long mod=1000000007;
        if(b==0) return 1;
        long halfRes= power(a,b/2)%mod;
        long res= (halfRes*halfRes)%mod;

        if(b%2==1){
            res=(res*a)%mod;
        }
        return res;
    }
}