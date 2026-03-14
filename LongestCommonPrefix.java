class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        String answer = "";

        for (int i = 0; i < prefix.length(); i++) {

            char current = prefix.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() || strs[j].charAt(i) != current) {
                    return answer;
                }
            }

            answer = answer + current;
        }

        return answer;
    }
}
