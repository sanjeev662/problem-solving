class Solution {
    public int repeatedStringMatch(String a, String b) {
        int nb=b.length();
        int na=a.length();

        int match=nb/na;
        int count=match;
        StringBuilder ss=new StringBuilder("");

        if(nb%na==0 && a.charAt(0)==b.charAt(0)){           
            while(count>0){
             ss.append(a);
             count--;
            }
            if(ss.toString().contains(b)) return match;
        }

        count=match+1;
        while(count>0){
             ss.append(a);
             count--;
        }
        if(ss.toString().contains(b)) return match+1;
        if(ss.append(a).toString().contains(b)) return match+2;

        return -1;
    }
}