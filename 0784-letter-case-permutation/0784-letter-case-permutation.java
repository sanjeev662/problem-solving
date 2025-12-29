class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ls=new ArrayList<>();
        ls.add(s);
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int len=ls.size();
            if (ch >= 'a' && ch <= 'z'){
                for(int j=0;j<len;j++){
                    String st = ls.get(j);
                    StringBuilder sb = new StringBuilder(st);
                    sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                    ls.add(sb.toString());
                }
            }else if(ch >= 'A' && ch <= 'Z'){
                for(int j=0;j<len;j++){
                    String st = ls.get(j);
                    StringBuilder sb = new StringBuilder(st);
                    sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
                    ls.add(sb.toString());
                }
            }else{
                continue;
            }
        }
        return ls;
    }
}