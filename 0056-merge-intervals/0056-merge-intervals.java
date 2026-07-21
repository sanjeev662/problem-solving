class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ll=new ArrayList<>();


        int n=intervals.length;
        ll.add(new ArrayList<>(List.of(intervals[0][0],intervals[0][1])));

        for(int i=1;i<n;i++){
            int prevfirst=ll.get(ll.size() - 1).get(0);
            int prevsecond=ll.get(ll.size() - 1).get(1);
            if(intervals[i][0] <= prevsecond){
                if(intervals[i][1]>prevsecond){
                    ll.set(ll.size() - 1, new ArrayList<>(List.of(prevfirst, intervals[i][1])));
                }
            }else{
                ll.add(new ArrayList<>(List.of(intervals[i][0],intervals[i][1])));
            }
        }

        

        int nn=ll.size();
        // System.out.println(nn);
        int[][] ans=new int[nn][2];

        for(int i=0;i<nn;i++){
            for(int j=0;j<2;j++){
                // System.out.println(ll.get(i).get(j));
                ans[i][j]=ll.get(i).get(j);
            }
        }

        return ans;
    }
}