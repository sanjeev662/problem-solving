class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String temp = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                temp = ch + temp;
            } else {
                if (!temp.isEmpty()) {
                    if (!ans.isEmpty()) {
                        ans += " ";
                    }
                    ans += temp;
                    temp = "";
                }
            }
        }

        if (!temp.isEmpty()) {
            if (!ans.isEmpty()) {
                ans += " ";
            }
            ans += temp;
        }

        return ans;
    }
}