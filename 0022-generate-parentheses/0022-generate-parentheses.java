class Element {
    String str;
    int open;
    int close;

    public Element(String str, int open, int close) {
        this.str = str;
        this.open = open;
        this.close = close;
    }
}


class Solution {

    public List<String> generateParenthesis(int n) {
        List<Element> ls=new LinkedList<>();
        ls.add(new Element("",0,0));

        for(int i=0;i<2*n;i++){
            int len=ls.size();

            for(int j=0;j<len;j++){
                Element element=ls.get(j);

                StringBuilder str=new StringBuilder(element.str);
                int open=element.open;
                int close=element.close;
                boolean flag=false;

                if(open<n){
                    str.append('(');
                    ls.set(j,new Element(str.toString(),open+1,close));
                    str.setLength(str.length() - 1);
                    flag=true;
                }
                if(open>0 && open>close && open<=n){
                    str.append(')');
                    if(!flag)
                    ls.set(j,new Element(str.toString(),open,close+1));
                    else
                    ls.add(new Element(str.toString(),open,close+1));
                }
            }
        }

        List<String> ansls=new ArrayList<>();

        for(Element l:ls){
            ansls.add(l.str);
        }

        return ansls;
    }
}