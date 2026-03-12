class Solution {
    public int firstUniqChar(String s) {
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            // q.add(String.valueOf(s.charAt(i))); ////if we use string in queue
            q.add(s.charAt(i));
        }
        int y=0;
        while(!q.isEmpty()){
            char x=q.peek();
            q.remove();
            if (s.indexOf(x) == s.lastIndexOf(x)) {
                return y;
            }
            y++;
        }
        return -1;
    }
}