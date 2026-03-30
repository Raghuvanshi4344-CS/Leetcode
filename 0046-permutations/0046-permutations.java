class Solution {

    private void solve(List<List<Integer>> ls, int []arr,int index){
        if(index>=arr.length){
            List<Integer> temp=new ArrayList<>();
            for(int num:arr){
                temp.add(num);
            }
            ls.add(temp);
            return;
        }
        for(int j=index;j<arr.length;j++){
            swap(arr,index,j);
            solve(ls,arr,index+1);
            swap(arr,index,j);
        }
    }

    private void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        solve(ls,nums,0);
        return ls;
    }
}