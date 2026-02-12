// class Solution {
//     public int evalRPN(String[] tokens) {
//         Stack<Integer> st = new Stack<>();
//         for (String s : tokens) {
//             if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
//                 int a = (st.pop());
//                 int b = (st.pop());
//                 if (s.equals("+")) {
//                     st.push( a + b);
//                 } else if (s.equals("-")) {
//                     st.push(  b-a);
//                 } else if (s.equals("*")) {
//                     st.push( a * b);
//                 } else {
//                     st.push( b/a);
//                 }
//             } else {
//                 st.push(Integer.parseInt(s));
//             }
//         }
//         return st.peek();
//     }
// }
class Solution {
    public int evalRPN(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for(String s:arr){
            if(s.equals("+")){
                int b = st.pop();
                int a = st.pop();
                st.push(a+b);
            }
            else if(s.equals("-")){
                int b = st.pop();
                int a = st.pop();
                st.push(a-b);
            }
            else if(s.equals("*")){
                int b = st.pop();
                int a = st.pop();
                st.push(a*b);
            }
            else if(s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                st.push(a/b);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}