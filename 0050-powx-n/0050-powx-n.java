class Solution {
    public double myPow(double x, int num) {
        double ans=1.0;
        long n=num;


        if(n==0) return 1.0;

        if(n<0){
            n=-(n);
            x=1/x;
        }

        while(n>0){
            if(n%2==1){
                ans=ans*x;
            }
            x*=x;
            n=n/2;
        }

        return ans;

    }
}