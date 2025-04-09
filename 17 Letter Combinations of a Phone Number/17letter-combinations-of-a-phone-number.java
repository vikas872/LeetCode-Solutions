class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        String[] mapping = new String[]{
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(result, digits, new StringBuilder(), 0, mapping);
        return result;
    }

    private void backtrack(List<String> result, String digits, StringBuilder current, int index, String[] mapping) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, digits, current, index + 1, mapping);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
