class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        for(;i<arr.length;){
            int ci=arr[i]-1;
            if(arr[i]>=1 && arr[i]!=arr[ci]){
                int temp=arr[ci];
                arr[ci]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        ArrayList <Integer> ar=new ArrayList<>();
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                ar.add(i+1);
            }
        }
        return ar;
    }
}