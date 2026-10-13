class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new LinkedList<>();
        helper(res,n,"",0,0);
        return res;
    }
    void helper(List<String> res,int n, String temp,int o,int c){
        if(o==n && o==c) res.add(temp);
        if(o<n) helper(res,n,temp+"(",o+1,c);
        if(c<o) helper(res,n,temp+")",o,c+1);
    }
}