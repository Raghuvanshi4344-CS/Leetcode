class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c) && map.get(c)>=x){
               x=map.get(c)+1;
            //    x++;
            }
            map.put(c,i);
            y=Math.max(y,i-x+1);
        }
        return y;
    }
}