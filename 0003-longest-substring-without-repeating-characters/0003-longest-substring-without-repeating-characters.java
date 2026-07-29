class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest=0;
        Map<Character,Integer> mp=new HashMap<>();
        int last=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(mp.containsKey(ch)){
                last=Math.max(last,mp.get(ch)+1);               
            }

            mp.put(ch,i);
            longest=Math.max(longest,(i-last+1));
        }
        return longest;
    }
}