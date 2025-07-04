class Solution {
    static void func(int []arr,List<List<Integer>> re,List<Integer> temp,int start){
        if(arr.length==temp.size()) {
            re.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if(temp.contains(arr[i])) continue;
            temp.add(arr[i]);
            func(arr,re,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> re=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        func(nums,re,temp,0);
        return re;
    }
}