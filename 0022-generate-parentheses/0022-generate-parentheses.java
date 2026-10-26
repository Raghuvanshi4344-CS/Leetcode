class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new LinkedList<>();
        helper(res,"",0,0,n);
        return res;
    }
    void helper(List<String> res,String temp,int o,int c,int n){
        if(o==n && o==c) res.add(temp);
        if(o<n) helper(res,temp+"(",o+1,c,n);
        if(c<o) helper(res,temp+")",o,c+1,n);
    }
}