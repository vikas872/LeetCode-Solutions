class Solution {
    public boolean checkOnesSegment(String s) {
        int l = 0;
        int r = 1;
        while(r<s.length()){
            if(s.charAt(r)=='1'){
                r++;
            }
            else{
                break;
            }
        }
    
        while(r<s.length()){
            if(s.charAt(r)=='1'){
                return false;
            }
            else{
                r++;
            }
        }
        return true;
    }
}