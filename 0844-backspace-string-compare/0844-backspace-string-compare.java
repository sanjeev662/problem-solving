// // ===== StringBuilder Common Methods (Quick Reference) =====

// // Add at end
// sb.append('a');            // append a single character
// sb.append("hello");        // append a string
// sb.append(123);            // append number

// // Remove characters
// sb.deleteCharAt(sb.length() - 1);   // remove last character
// sb.delete(1, 3);                    // remove substring [1, 3)

// // Access / modify
// sb.charAt(0);             // get character at index
// sb.setCharAt(0, 'X');     // replace character at index

// // Length & conversion
// sb.length();              // current length
// sb.toString();            // convert to String

// // Insert at index
// sb.insert(1, 'a');        // insert char at index
// sb.insert(2, "abc");      // insert string at index

// // Reverse string
// sb.reverse();             // reverse characters

// // Clear StringBuilder
// sb.setLength(0);          // remove all characters



//O(n) Space
//class Solution {
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
