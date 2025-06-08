class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> iso=new HashMap<>();
        Map<Character, Character> iso2=new HashMap<>();

        if(s.length()!=t.length())
        return false;

        for(int i=0;i<s.length();i++){
            if(iso.containsKey(s.charAt(i)) && (iso.get(s.charAt(i))!=t.charAt(i))){
                return false;
            }else{
                iso.put(s.charAt(i) , t.charAt(i));
            }
        }

        for(int i=0;i<t.length();i++){
            if(iso2.containsKey(t.charAt(i)) && (iso2.get(t.charAt(i))!=s.charAt(i))){
                return false;
            }else{
                iso2.put(t.charAt(i) , s.charAt(i));
            }
        }
        return true;
    }
}