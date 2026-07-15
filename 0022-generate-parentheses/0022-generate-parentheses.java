class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> s=new LinkedList<>();
        func(s,"",n,0,0);
        return s;
    }
    public static void func(List<String> s,String temp,int n,int o,int c){
        if(o==n && o==c) s.add(temp);
        if(o<n) func(s,temp+"(",n,o+1,c);
        if(c<o) func(s,temp+")",n,o,c+1);
    }
}