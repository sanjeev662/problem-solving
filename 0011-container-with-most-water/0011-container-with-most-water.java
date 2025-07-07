class Solution {
    public int maxArea(int[] height) {
        int n=height.length-1;
        int l=0;
        int r=n;
        int max=0;

        while(l<r){
            int area=Math.min(height[l],height[r]);
            area=area*(r-l);

            max=Math.max(area,max);

            if(height[l]>height[r]) r--;
            else l++;
        }
        return max;
    }
}