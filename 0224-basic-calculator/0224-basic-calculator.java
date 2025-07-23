class Solution {
    public int calculate(String s) {
        int ans=0;
        int num=0;
        int sign=1;
        Stack<Integer> st=new Stack<>();
        st.push(sign);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='(') st.push(sign);
            else if(c==')') st.pop();
            else if(c=='+' || c=='-'){
                ans+=sign*num;
                sign=(c=='+'?1:-1)*st.peek();
                num=0;
            }
        }
        return ans+sign*num;
    }
}