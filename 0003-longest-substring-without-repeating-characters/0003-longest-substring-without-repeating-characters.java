class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(mp.containsKey(c)){
                x=  Math.max(x,mp.get(c)+1);
            }
            mp.put(c,i);
            y=Math.max(y,i-x+1);
        }
        return y;
    }
}