class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Stack<Integer> st = new Stack<>();
        char lastOp = '+';
        int currNum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch) == true) {
                currNum = currNum * 10 + (ch - '0');
            }

            if (Character.isDigit(ch) == false && ch != ' ' || i == n - 1) {
                if (lastOp == '+') {
                    st.push(currNum);
                } else if (lastOp == '-') {
                    st.push(-currNum);
                } else if (lastOp == '*') {
                    st.push(st.pop() * currNum);
                } else {
                    st.push(st.pop() / currNum);
                }
                lastOp = ch;
                currNum = 0;
            }
        }
        int result = 0;
        for(int num:st){
            result+=num;
        }
        return result;
    }
}