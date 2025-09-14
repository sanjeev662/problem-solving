class Solution {
    public String decodeString(String s) {
       Stack<String> currStr=new Stack<>();
       Stack<Integer> currNum=new Stack<>();

       int n=s.length();
       for(int i=0; i<n;i++){
        char ch=s.charAt(i);
        if(']'== ch && !currStr.isEmpty()){
            String temp="";
            while(!currStr.peek().equals("[") && !currStr.isEmpty()){
                temp=currStr.pop()+temp;
            }
            currStr.pop();
            int count=currNum.pop();
            String tempFinal="";
            while(count>0){
                tempFinal+=temp;
                count--;
            }
            currStr.push(tempFinal);
        }else if(Character.isDigit(ch)){
            String str="";
            while(s.charAt(i)!='['){
                str+=s.charAt(i);
                if(i<n-1)
                i++;
            }
            i--;
            currNum.push(Integer.parseInt(str));
        }
        else{
            currStr.push(""+ch);
        }
       }
       String ans="";
       while(!currStr.isEmpty()){
            ans=currStr.pop()+ans;
       }
       return ans;
    }
}