class Solution {
    public boolean backspaceCompare(String s, String t) {
        String sfinal="";
        String tfinal="";
        int ns=s.length();
        int nt=t.length();
        int i=0;
        

        while(i<ns){
            if(s.charAt(i)=='#')
            {   
                if(sfinal.length()>0)
                sfinal = sfinal.substring(0, sfinal.length() - 1);
            }else{
                sfinal=sfinal+s.charAt(i);
            }
            i++;
        }

        i=0;
        while(i<nt){
            if(t.charAt(i)=='#')
            {   
                if(tfinal.length()>0)
                tfinal = tfinal.substring(0, tfinal.length() - 1);
            }else{
                tfinal=tfinal+t.charAt(i);
            }
            i++;
        }
        System.out.println(sfinal);
        System.out.println(tfinal);

        return sfinal.equals(tfinal);
        
    }
}