class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int l=0,r=n-1;
        int ans=0;

        while(l<=r){
            int mid=l+((r-l)/2);

            if(letters[mid]==target){
                // return mid+1==n?letters[0]:letters[mid+1];
                l=mid+1;
            }else if(letters[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }

        return l>=n?letters[0]:letters[l];        
    }
}