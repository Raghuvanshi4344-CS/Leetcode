class Solution {
    static void func(int []arr,List<Integer> temp,List<List<Integer>> re,int start){
        re.add(new ArrayList<>(temp));
        for(int i=start;i<arr.length;i++){
            temp.add(arr[i]);
            func(arr,temp,re,i+1);
            temp.remove(temp.size()-1);
        }
    } 
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> re= new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        func(nums,temp,re,0);
        return re;
    }
}