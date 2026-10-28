class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> mp=new HashMap<>();

        int left=0;
        int maxFruits=0;
        int n=fruits.length;

        for(int i=0;i<n;i++){
            mp.put(fruits[i],mp.getOrDefault(fruits[i],0)+1);

            while(mp.size()>2){
                mp.put(fruits[left],mp.get(fruits[left])-1);

                if(mp.get(fruits[left])<=0){
                    mp.remove(fruits[left]);
                }

                left++;
            }

            maxFruits=Math.max(maxFruits,i-left+1);
        }
        return maxFruits;
    }
}