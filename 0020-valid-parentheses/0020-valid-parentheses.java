class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int c=0;c<s.length();c++){
            char i=s.charAt(c);
            if(i=='[') st.push(']');
            else if(i=='(') st.push(')');
            else if(i=='{') st.push('}');
            else if(st.isEmpty() || st.pop()!=i) return false;
        }
        return st.isEmpty();
    }
}