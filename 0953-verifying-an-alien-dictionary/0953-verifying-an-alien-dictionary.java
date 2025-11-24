class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<words.length-1;i++){
            if(!compare(words[i],words[i+1],order)){
                return false;
            }
        }
        return true;
    }

    public boolean compare(String word1,String word2, String order){
        int i=0;

        while(i<word1.length() && i<word2.length() && word1.charAt(i)==word2.charAt(i)){
            i++;
        }

        if (i == word1.length()) return true;

        if (i == word2.length()) return false;

        return order.indexOf(word1.charAt(i)) < order.indexOf(word2.charAt(i));
    }
}