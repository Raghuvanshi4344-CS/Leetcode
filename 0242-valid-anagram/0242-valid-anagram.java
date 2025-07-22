class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hash=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(hash.containsKey(c) && hash.get(c)>0){
                hash.put(c, hash.get(c) - 1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}