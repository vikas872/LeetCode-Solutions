class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] comp = path.split("/");
        for(String dir:comp){
            if(dir.equals("..")){
                if(!st.empty()){
                    st.pop();
                }
            }else if(dir.equals(".") || dir.equals("")){
                continue;
            }else{
                st.push(dir);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String str:st){
            sb.append("/").append(str);
        }
        return sb.isEmpty()==true? "/":sb.toString();
    }
}