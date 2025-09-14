class Solution {
    public String decodeString(String s) {
       Stack<String> currStr=new Stack<>();
       Stack<Integer> currNum=new Stack<>();

       int n=s.length();
       String num="";
       String str="";

       for(int i=0; i<n;i++){
        char ch=s.charAt(i);
        if(Character.isDigit(ch)){
            num+=ch;
        }
        else if('['== ch){
            currNum.push(Integer.parseInt(num));
            currStr.push(str);
            num="";
            str="";
        }
        else if(']'== ch){
            String prevStr=currStr.pop();
            int count=currNum.pop();
            String tempFinal="";
            while(count>0){
                tempFinal+=str;
                count--;
            }
            str=prevStr+tempFinal;
        }
        else{
            str+=ch;
        }
       }
        return str;
    }
}