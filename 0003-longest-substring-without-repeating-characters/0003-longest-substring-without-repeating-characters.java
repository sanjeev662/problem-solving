class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();

        int left=0;
        int longest=0;


        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);

            while(st.contains(ch)){
                st.remove(s.charAt(left));
                left++;
            }

            st.add(ch);
            longest=Math.max(longest,st.size());
        }

        return longest;
    }
}