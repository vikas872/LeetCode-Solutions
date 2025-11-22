class Solution {
    public String removeDuplicateLetters(String s) {
        int[] frq = new int[26];
        for(char ch:s.toCharArray()){
            frq[ch-'a']++;
        }

        boolean[] vis = new boolean[26];
        Stack<Character> st = new Stack<>();

        for(char ch:s.toCharArray()){
            frq[ch-'a']--;

            if(vis[ch-'a']==true){
                continue;
            }
            
            while(st.empty()==false && st.peek()>ch && frq[st.peek()-'a']>0){

                char del = st.pop();
                vis[del-'a'] = false;
            }

            st.push(ch);
            vis[ch-'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        } 

        return sb.toString();
    }
}