class Solution {
    static void func(int []arr,List<List<Integer>> re,List <Integer> temp,int start){
        re.add(new ArrayList<>(temp));
        for(int i=start;i<arr.length;i++){
            if (i > start && arr[i] == arr[i - 1]) continue;
            temp.add(arr[i]);
            func(arr,re,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> re=new ArrayList<>();
        List <Integer> temp=new ArrayList<>();
        func(nums,re,temp,0);
        return re;
    }
}