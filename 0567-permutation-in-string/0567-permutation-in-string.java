class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();

        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();

        for(int i=0;i<n1;i++){
            char ch1=s1.charAt(i);
            need.put(ch1,need.getOrDefault(ch1,0)+1);
        }

        int left=0;

        for(int right=0;right<n2;right++){
            char ch2=s2.charAt(right);

            window.put(ch2,window.getOrDefault(ch2,0)+1);

            if(right-left+1>n1){
                char re=s2.charAt(left);
                window.put(re,window.get(re)-1);

                if(window.get(re)==0){
                    window.remove(re);
                }
                left++;
            }

            if(window.equals(need)){
                return true;
            }
        }

        return false;
    }
}