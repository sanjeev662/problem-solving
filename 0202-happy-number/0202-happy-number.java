class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        while(true){
         slow=squareSum(slow);
         fast=squareSum(squareSum(fast));
         if(slow==fast) break;
         }

        return slow==1;
    }

    public int squareSum(int n){
        int sum=0;
        while(n>0){
            int unit=n%10;
            sum+=unit*unit;
            n=n/10;
        }
        return sum;
    }
}