class Solution {
    public boolean checkIfPangram(String s) {
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(char ch:s){
        //     map.getOrDefault((ch,0)+1);
        // }
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if(set.size()==26){
            return true;
        }
        return false;
        

    }
}