class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder("");
        StringBuilder temp = new StringBuilder("");

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                temp.insert(0,ch);
            } else {
                if (temp.length()>0) {
                    if (ans.length()>0) {
                        ans.append(" ");
                    }
                    ans.append(temp);
                    temp.setLength(0);
                }
            }
        }

        if (temp.length()>0) {
            if (ans.length()>0) {
                ans.append(" ");
            }
            ans.append(temp);
        }

        return ans.toString();
    }
}