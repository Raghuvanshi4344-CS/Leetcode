class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>re=new ArrayList<>();
        func(re,"",n,0,0);
        return re;
    }
    public static void func(List<String>re,String temp,int n,int o,int c){
        if(o==n && o==c) re.add(temp);
        if(o<n) func(re,temp+"(",n,o+1,c);
        if(o>c) func(re,temp+")",n,o,c+1);
    }
}