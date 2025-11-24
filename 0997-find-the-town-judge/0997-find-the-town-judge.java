class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inorder = new int[n+1];
        int[] outorder = new int[n+1];

        for(int[] temp: trust){
            int a=temp[0];
            int b=temp[1];

            inorder[b]++;
            outorder[a]++;
        }

        for(int i=1;i<=n;i++){
            if(inorder[i]==n-1 && outorder[i]==0)
            return i;
        }
        return -1;

    }
}