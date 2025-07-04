class Solution {
    void func(List<String> x,String temp,int n,int o,int c){
        if(o==n && o==c){
            x.add(temp);
        }
        if(o<n){
            func(x,temp+"(",n,o+1,c);
        }
        if(o>c){
            func(x,temp+")",n,o,c+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> x=new ArrayList<>();
        func(x,"",n,0,0);
        return x;
    }
}