class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n1=p.length();
        int n2=s.length();

        Map<Character,Integer> ss=new HashMap<>();
        Map<Character,Integer> pp=new HashMap<>();
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<n1;i++){
            char ch=p.charAt(i);
            pp.put(ch,pp.getOrDefault(ch,0)+1);
        }

        int left=0;

        for(int right=0; right<n2; right++){
            char ch=s.charAt(right);
            ss.put(ch,ss.getOrDefault(ch,0)+1);

            if(right-left+1>n1){
                char leftch=s.charAt(left);
                ss.put(leftch,ss.get(leftch)-1);

                if(ss.get(leftch)==0){
                    ss.remove(leftch);
                }
                left++;
            }

            if(ss.equals(pp)){
                ans.add(left);
            }
        }
        return ans;
    }
}