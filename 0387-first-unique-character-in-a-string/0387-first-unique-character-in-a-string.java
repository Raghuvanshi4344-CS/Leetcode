class Solution {
    public int firstUniqChar(String s) {
        Queue<Character> q=new LinkedList<>();
        Set<Character> removed=new HashSet<>();
        for(int i=0;i<s.length();i++){
            // q.add(String.valueOf(s.charAt(i))); ////if we use string in queue
            q.add(s.charAt(i));
        }
        int y=0;
        while(!q.isEmpty()){
            char x=q.poll();
            if (!q.contains(x)&&!removed.contains(x)) {
                return y;
            }
            removed.add(x);
            y++;
        }
        return -1;
    }
}