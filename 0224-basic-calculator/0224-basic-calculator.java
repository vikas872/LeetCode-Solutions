class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        int curr = 0;
        int sign = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                curr = s.charAt(i)-'0';
                while (i + 1 < n && Character.isDigit(s.charAt(i + 1))) {
                    curr = curr * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
                curr = curr*sign;
                sum+=curr;
                curr = 0;
            }else if(s.charAt(i)=='+'){
                sign = 1;
            }else if(s.charAt(i)=='-'){
                sign = -1;
            }else if(s.charAt(i)=='('){
                st.push(sum);
                st.push(sign);
                sum = 0;
                sign = 1;
            }else if(s.charAt(i)==' '){
                continue;
            }
            else{
                int prvSign = st.pop();
                sum = sum*prvSign;
                int prvSum = st.pop();
                sum = sum + prvSum; 
            }
        }
        return sum;
    }
}