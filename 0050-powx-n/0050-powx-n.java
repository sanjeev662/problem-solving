class Solution {
    // public double myPow(double x, int n) {
    //     long temp=n;

    //     if(n==0 || x==1) return 1;

    //     if(n<0){
    //         x=1/x;
    //         temp=-1L*temp;
    //     }

    //     double ans=1;
    //     for(int i=0;i<temp;i++){
    //         ans=ans*x;
    //     }
    //     return ans;
    // }


    public double myPow(double x, int n) {
        if(n==0 || x==1) return 1;
        double ans=1;
        long temp=n;

        if(n<0){
            temp=-1L*n;
        }

        ans=power(x,temp);

        if(n<0){
            return 1/ans;
        }

        return ans;
    }

    public double power(double x, long n){
        if(n==0) return 1;
        if(n==1) return x;

        if(n%2==0)
        return power(x*x,n/2);
        
        return x*power(x,n-1);
    }

}