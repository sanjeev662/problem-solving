class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int totalWeight= 0;
        int minWeight= 0;
        for (int weight : weights) {
            totalWeight+=weight;
            if(minWeight< weight){
                minWeight=weight;
            }
        }
        
        int l = minWeight; // Minimum possible capacity
        int r = totalWeight; // Maximum possible capacity
        int minWeightCapacity = totalWeight;

        while(l<=r){
            int mid=l+(r-l)/2;
            int takendays=takenDays(mid,weights);
            if(takendays<=days){
                if(minWeightCapacity>mid){
                    minWeightCapacity=mid;
                }
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return minWeightCapacity;
    }

    public int takenDays(int capacity,int[] weights){
        int i=0;
        int n=weights.length;
        int days=1;
        int temp=0;
        while(i<n){
            temp+=weights[i];
            if(temp>capacity)
            {
                days++;
                temp=weights[i];
            }else if(temp==capacity){
                if(i!=(n-1))
                days++;
                temp=0;
            }
            i++;
        }
        System.out.println(days +" and "+ capacity);
        return days;
    }
}