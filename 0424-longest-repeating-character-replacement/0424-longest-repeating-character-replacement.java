class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength=0;
        int maxFreq=0;
        int left=0;
        int[] freq=new int[26];

        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'A';

            freq[index]++;

            maxFreq=Math.max(maxFreq,freq[index]);

            while((i-left+1)-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            maxLength=Math.max(maxLength,i-left+1);
        }

        return maxLength;
    }
}