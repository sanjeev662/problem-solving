// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] arr=new int[2];
//         int n=nums.length;
//         int l=0,r=n-1;
//         int start=-1,end=-1;

//         while(l<=r){
//             int mid=l+(r-l)/2;

//             if(nums[mid]<target){
//                 l=mid+1;
//             }else if(nums[mid]>target){
//                 r=mid-1;
//             }else{
//                 start = mid;
//                 while (start - 1 >= 0 && nums[start - 1] == target) {
//                     start--;
//                 }
//                 end = mid;
//                 while (end + 1 < n && nums[end + 1] == target) {
//                     end++;
//                 }
//                 break;
//             }
//         }

//         arr[0]=start;
//         arr[1]=end;

//         return arr;
//     }
// }


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};

        res[0] = findFirst(nums, target);
        if (res[0] == -1) return res; // target not found
        res[1] = findLast(nums, target);

        return res;
    }

    private int findFirst(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }

    private int findLast(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            if (nums[mid] == target) ans = mid;
        }
        return ans;
    }
}
