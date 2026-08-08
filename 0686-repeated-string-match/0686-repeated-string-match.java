class Solution {
    public int repeatedStringMatch(String a, String b) {
        int nb=b.length();
        int na=a.length();

        int match=nb/na;
        int count=match;
        StringBuilder ss=new StringBuilder("");
        
        while(count>0){
             ss.append(a);
             count--;
        }
        
        if(nb%na==0 && ss.toString().contains(b)) return match;
        ss.append(a);
        if(ss.toString().contains(b)) return match+1;
        ss.append(a);
        if(ss.toString().contains(b)) return match+2;

        return -1;
    }
}