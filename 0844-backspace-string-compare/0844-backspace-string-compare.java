class Solution {
    public boolean backspaceCompare(String s, String t) {
        return finalString(s).equals(finalString(t));
    }

    private String finalString(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
