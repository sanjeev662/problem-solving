class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        // PriorityQueue<Map.Entry<Integer,Integer>> heap=new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());

        // for(Map.Entry<Integer,Integer> map : mp.entrySet()){
        //     heap.add(map);
        //     if(heap.size()>2){
        //         heap.poll();
        //     }
        // }

        // int[] ans= new int[k];
        // for(int i=0;i<k;i++){
        //     ans[i] = heap.poll().getKey();
        // }

        PriorityQueue<Integer> heap= new PriorityQueue<>(
            (a,b) -> mp.get(a)-mp.get(b)
        );

        for(Map.Entry<Integer,Integer> map : mp.entrySet()){

            heap.add(map.getKey());
            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] ans= new int[k];
        for(int i=0;i<k;i++){
            ans[i]=heap.poll();
        }

        return ans;
    }
}