class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp=new HashMap<>();

        for(char ch: s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->
        b.getValue()-a.getValue());

        pq.addAll(mp.entrySet());

        StringBuilder st=new StringBuilder();

        while (!pq.isEmpty()) {
            Map.Entry<Character,Integer> mmpp=pq.poll();
            char c=mmpp.getKey();
            int i=mmpp.getValue();
            for(int j=0;j<i;j++)
            st.append(c);
        }

        return st.toString();
    }
}