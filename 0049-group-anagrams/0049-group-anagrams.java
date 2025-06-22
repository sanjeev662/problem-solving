class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n= strs.length;
        Map<String,List<String>> map=new HashMap<>();

        for(int i=0;i<n;i++){
            char[] chara = strs[i].toCharArray();
            Arrays.sort(chara);
            String key = String.valueOf(chara);

            if(map.containsKey(key)){
                List<String> mapl=map.get(key);
                mapl.add(strs[i]);
                map.put(key,mapl);
            }else{
                List<String> lss=new ArrayList<>();
                lss.add(strs[i]);
                map.put(key,lss);
            }
        }

        List<List<String>> ans= new ArrayList<List<String>>();
        for( String st: map.keySet()){
            List<String> ll = map.get(st);
            ans.add(ll);
        }
        return ans;      
    }
}