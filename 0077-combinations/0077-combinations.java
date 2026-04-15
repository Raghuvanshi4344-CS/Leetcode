class Solution {

    void help(List<List<Integer>> re,List<Integer>temp,int st,int n,int k){
        if(temp.size()==k){
            re.add(new ArrayList<>(temp));
            return;
        }
        for(int i=st;i<=n;i++){
            temp.add(i);
            help(re,temp,i+1,n,k);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> re=new ArrayList<>();
        // for(int i=1;i<=n;i++)
        help(re,new ArrayList<>(),1,n,k);
        return re;
    }
}