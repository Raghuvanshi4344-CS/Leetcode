class Solution {
    public int countBinarySubstrings(String s) {
        int prevg=0;
        int currg=1;
        int res=0;
        for(int i=1;i<s.length();i++){
            if (s.charAt(i)==s.charAt(i-1)){
                currg++;
            }
            else{
                prevg=currg;
                currg=1;
            }
            if(currg<=prevg) res++;
        }
        return res; 
    }
}