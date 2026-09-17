class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> re=new ArrayList<>();
        func(re,"",n,0,0);
        return re;
    }
    void func(List<String> s,String temp,int n,int o,int c){
        if(o==n&&c==o) s.add(temp);
        if(o<n)func(s,temp+"(",n,o+1,c);
        if(c<o)func(s,temp+")",n,o,c+1);
    }
}