class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sfinal = new StringBuilder();
        StringBuilder tfinal = new StringBuilder();
        int ns=s.length();
        int nt=t.length();
        int i=0;
        

        while(i<ns){
            if(s.charAt(i)=='#')
            {
                if(sfinal.length()>0)
                sfinal.deleteCharAt(sfinal.length() - 1);
            }else{
                sfinal.append(s.charAt(i));
            }
            i++;
        }

        i=0;
        while(i<nt){
            if(t.charAt(i)=='#')
            {   
                if(tfinal.length()>0)
                tfinal.deleteCharAt(tfinal.length() - 1);
            }else{
                tfinal.append(t.charAt(i));
            }
            i++;
        }
        System.out.println(sfinal);
        System.out.println(tfinal);

        return (sfinal.toString()).equals((tfinal.toString()));
        
    }
}