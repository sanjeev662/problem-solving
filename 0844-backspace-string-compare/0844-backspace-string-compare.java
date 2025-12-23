// class Solution {
//     public boolean backspaceCompare(String s, String t) {
//         return finalString(s).equals(finalString(t));
//     }

//     private String finalString(String str) {
//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (ch == '#') {
//                 if (sb.length() > 0) {
//                     sb.deleteCharAt(sb.length() - 1);
//                 }
//             } else {
//                 sb.append(ch);
//             }
//         }

//         return sb.toString();
//     }
// }

//Two-Pointer Solution (O(1) Space)
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        int skipS = 0;
        int skipT = 0;

        while (i >= 0 || j >= 0) {

            // Find next valid char in s
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }

            // Find next valid char in t
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }

            // Compare characters
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) return false;
            } else {
                // One string ended before the other
                if (i >= 0 || j >= 0) return false;
            }

            i--;
            j--;
        }

        return true;
    }
}
