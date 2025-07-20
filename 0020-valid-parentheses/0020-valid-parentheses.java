class Solution {
    public boolean isValid(String s) {
        if(s.length()<=1) return false;
        Stack<Character>q=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(') q.push(')');
            else if(c=='[') q.push(']');
            else if(c=='{') q.push('}');
            else if(q.isEmpty() || q.pop()!=c) return false;
        }
        return q.isEmpty();
    }
}