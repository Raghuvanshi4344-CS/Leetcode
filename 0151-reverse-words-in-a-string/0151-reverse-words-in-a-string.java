class Solution {
    public String reverseWords(String s) {
        char[] res=s.toCharArray();
        StringBuilder temp=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=res.length-1;i>=0;i--){
            if(res[i]==' '){
                if(temp.length()>0){
                    ans.append(temp.reverse()).append(" ");
                    temp.setLength(0);
                }
            }
            else{
                temp.append(res[i]);
            }
        }
        if(temp.length()>0){
            ans.append(temp.reverse());
        }
        return ans.toString().trim();
    }
}