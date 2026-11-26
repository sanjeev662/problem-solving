class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        List<int[]> result=new ArrayList<>();

        for(int i=0;i<intervals.length;i++){
            int[] current = intervals[i];

            if(result.size()==0){
                result.add(current);
            }else{
                int[] last=result.get(result.size()-1);

                if(current[0]<=last[1]){
                    last[1]=Math.max(last[1],current[1]);
                }else{
                    result.add(current);
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}