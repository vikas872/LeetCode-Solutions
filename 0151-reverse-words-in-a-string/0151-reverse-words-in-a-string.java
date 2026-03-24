class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            words[i] = words[i].trim();
            sb.append(words[i]);
            sb.append(' ');
        }
        // sb.replace("\\s+", ' ');
        return sb.toString().trim();
    }
}