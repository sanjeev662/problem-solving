class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1)));
        

        for(int i=1;i<numRows;i++){
            List<Integer> lastList = ans.get(ans.size()-1);
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=0;j<lastList.size()-1;j++){
                temp.add(lastList.get(j)+lastList.get(j+1));
            }
            temp.add(1);
            ans.add(temp);
        }

        return ans;
    }
}