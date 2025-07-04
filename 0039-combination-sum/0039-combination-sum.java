class Solution {
    void func(int []arr,int target,List<List<Integer>> res,List<Integer> temp,int start,int sum){
        if(sum==target) {
            res.add(new ArrayList<>(temp));
        }
        if(sum>target) return;
        for(int i=start;i<arr.length;i++){
            temp.add(arr[i]);
            func(arr,target,res,temp,i,sum+arr[i]);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        func(candidates,target,res,temp,0,0);
        return res;
    }
}