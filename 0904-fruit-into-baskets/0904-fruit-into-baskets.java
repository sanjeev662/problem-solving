class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> mp=new HashMap<>();
        int windowstart=0;
        int maxFruit=0;
        int n=fruits.length;

        for(int i=0;i<n;i++){
            mp.put(fruits[i],mp.getOrDefault(fruits[i],0)+1);

            while(mp.size()>2){
                int leftfruit=fruits[windowstart];
                mp.put(leftfruit,(mp.get(leftfruit)-1));

                if(mp.get(leftfruit)<=0){
                    mp.remove(leftfruit);
                }
                windowstart++;
            }

            maxFruit=Math.max(maxFruit,i-windowstart+1);
        }
        return maxFruit;
    }
}