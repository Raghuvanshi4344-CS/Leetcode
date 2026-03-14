class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String []part=path.split("/");
        for(int i=0;i<part.length;i++){
            if(part[i].equals("") || part[i].equals(".")){
                continue;
            }
            if(part[i].equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else{
                s.push(part[i]);
            }
        }
        if(s.isEmpty()) return "/";
        String y="";
        for(int i=0;i<s.size();i++){
            y=y+"/"+s.get(i);
        }
        return y;
    }
}