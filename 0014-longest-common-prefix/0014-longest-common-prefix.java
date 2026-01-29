class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int x=strs[0].length();
        for(int i=0;i<strs.length-1;i++){
            String a=strs[i];
            String b=strs[i+1];
            int j = 0;
            while (j < a.length() && j < b.length() && a.charAt(j) == b.charAt(j)) {
                j++;
            }

            x = Math.min(x, j);
        }
        return strs[0].substring(0,x);
    }
}