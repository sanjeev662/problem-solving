class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result=new ArrayList<>();
        boolean added=false;

        for(int[] current : intervals){
            if(current[1]<newInterval[0]){
                result.add(current);
            }else if(current[0]>newInterval[1]){
                if(!added){
                    result.add(newInterval);
                    added=true;
                }
                result.add(current);
            }else{
                newInterval[0]=Math.min(current[0],newInterval[0]);
                newInterval[1]=Math.max(current[1],newInterval[1]);
            }
        }

        if (!added) {
            result.add(newInterval);
        }
        return result.toArray(new int[result.size()][]);
    }
}