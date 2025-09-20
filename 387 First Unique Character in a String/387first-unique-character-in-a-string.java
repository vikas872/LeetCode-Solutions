class Solution {
            static boolean isfurther(int n, char c, String s){
            for(int i = 0;i<s.length();i++){
                if((s.charAt(i)==c)&& i!=n){
                    return true;
                }
            }
            return false;
        }
    public int firstUniqChar(String s) {

        for(int i=0;i<s.length();i++){
            if(isfurther(i,s.charAt(i),s)==false){
                return i;
            }
        }
        return -1;
    }
}