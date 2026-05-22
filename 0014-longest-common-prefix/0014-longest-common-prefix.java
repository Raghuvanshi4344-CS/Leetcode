class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String res=strs[0];;
        for(int i=1;i<strs.length;i++){
            String tem=strs[i];
            int min=Math.min(tem.length(),res.length());
            String temp="";
            for(int j=min;j>=0;j--){
                if(tem.substring(0,j).equals(res.substring(0,j))){
                    temp=tem.substring(0,j);
                    break;
                }
            }
            // System.out.println()
            if(temp==null) return"";
            res=temp;
        }
        return res;
    }
}