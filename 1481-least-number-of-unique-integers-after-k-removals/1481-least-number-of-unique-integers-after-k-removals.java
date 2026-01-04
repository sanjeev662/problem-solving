class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->(
            a.getValue()-b.getValue()
        ));

        pq.addAll(mp.entrySet());

        while(!pq.isEmpty()){
            int temp=pq.remove().getValue();
            k=k-temp;
            if(k==0) return pq.size();
            if(k<0) return pq.size()+1;
        }

        return pq.size();
    }
}