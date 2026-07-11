class Solution {
    public boolean isValid(String s) {
        // if(s.length()<2) return false;
        // if(s.charAt(0)==')' ||s.charAt(0)==']' ||s.charAt(0)=='}') return false;
        Stack<Character> re=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')re.push('(');
            else if(s.charAt(i)=='[')re.push('[');
            else if(s.charAt(i)=='{')re.push('{');
            else if(s.charAt(i)==')'&& !re.isEmpty() && re.peek()=='(' ) re.pop();
            else if(s.charAt(i)==']'&& !re.isEmpty()&& re.peek()=='[') re.pop();
            else if(s.charAt(i)=='}' && !re.isEmpty()&& re.peek()=='{') re.pop();
            else{
                return false;
            }
        }
        if(re.isEmpty()) return true;
        else return false;
    }
}