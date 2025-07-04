class Solution {
    boolean Palindrome(String s,int low,int high){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
    void func(String s,List<List<String>> re,List<String> temp,int start){
        if(start==s.length()){
            re.add(new ArrayList<>(temp));
        }
        for(int i=start+1;i<=s.length();i++){
            String subs=s.substring(start,i);
            if(Palindrome(subs,0,subs.length()-1)){
                temp.add(subs);
                func(s,re,temp,i);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> re=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        func(s,re,temp,0);
        return re;
    }
}