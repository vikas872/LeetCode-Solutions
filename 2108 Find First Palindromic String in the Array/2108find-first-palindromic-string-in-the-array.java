class Solution {
    public static boolean isPalindrome(String s){
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String s: words){
            if(isPalindrome(s)==true){
                return s;
            }
        }
        String ans = "";
        
            return ans;
        
    }
}