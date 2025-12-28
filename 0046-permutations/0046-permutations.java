// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans=new ArrayList<>();
//         ans.add(new ArrayList<>());

//         for(int i=0;i<nums.length;i++){
//             int len=ans.size();
//             for(int j=0;j<len;j++){
//                 List<Integer> ls=new LinkedList<>(ans.get(j));
//                 int lslen=ls.size();

//                 for (int ii = 0; ii <= lslen; ii++) {
//                     ls.add(ii, nums[i]);              // insert at index ii
//                     ans.add(new LinkedList<>(ls));    // copy
//                     ls.remove(ii);                    // 🔴 MUST undo (backtrack)
//                 }
//             }
//         }

//         List<List<Integer>> finalans=new ArrayList<>();
//         for(List<Integer> arr: ans){
//             if(arr.size()==nums.length)
//             finalans.add(arr);
//         }

//         return finalans;
//     }
// }



class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){
            int len=ans.size();
            for(int j=0;j<len;j++){
                List<Integer> oldls=ans.remove(0);
                int oldlen=oldls.size();

                for (int ii = 0; ii <= oldlen; ii++) {
                    oldls.add(ii, nums[i]);              // insert at index ii
                    ans.add(new LinkedList<>(oldls));    // copy
                    oldls.remove(ii);                    // 🔴 MUST undo (backtrack)
                }
            }
        }
        
        return ans;
    }
}