// // class Solution {
// //     public List<String> letterCasePermutation(String s) {
// //         List<String> ls=new ArrayList<>();
// //         ls.add(s);
// //         int n=s.length();

// //         for(int i=0;i<n;i++){
// //             char ch=s.charAt(i);
// //             int len=ls.size();
// //             if (ch >= 'a' && ch <= 'z'){
// //                 for(int j=0;j<len;j++){
// //                     String st = ls.get(j);
// //                     StringBuilder sb = new StringBuilder(st);
// //                     sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
// //                     ls.add(sb.toString());
// //                 }
// //             }else if(ch >= 'A' && ch <= 'Z'){
// //                 for(int j=0;j<len;j++){
// //                     String st = ls.get(j);
// //                     StringBuilder sb = new StringBuilder(st);
// //                     sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
// //                     ls.add(sb.toString());
// //                 }
// //             }else{
// //                 continue;
// //             }
// //         }
// //         return ls;
// //     }
// // }


// class Solution {
//     public List<String> letterCasePermutation(String s) {
//         List<String> ls=new ArrayList<>();
//         ls.add(s);
//         int n=s.length();

//         for(int i=0;i<n;i++){
//             char ch=s.charAt(i);

//             if(!Character.isLetter(ch)) continue;

//             int len=ls.size();
//             for(int j=0;j<len;j++){
//                 String st = ls.get(j);
//                 StringBuilder sb = new StringBuilder(st);

//                 if(Character.isUpperCase(sb.charAt(i)))
//                 sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
//                 else
//                 sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));

//                 ls.add(sb.toString());
//             }
//         }
//         return ls;
//     }
// }

class Solution {
    public List<String> letterCasePermutation(String s) {

        List<String> ans = new ArrayList<>();
        ans.add(s);

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) continue;

            int size = ans.size();

            for (int j = 0; j < size; j++) {
                char[] chars = ans.get(j).toCharArray();

                // toggle case
                if (Character.isLowerCase(chars[i])) {
                    chars[i] = Character.toUpperCase(chars[i]);
                } else {
                    chars[i] = Character.toLowerCase(chars[i]);
                }

                ans.add(new String(chars));
            }
        }
        return ans;
    }
}
