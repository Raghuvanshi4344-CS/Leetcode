class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;
        for(;i<arr.length;){
            int ci=arr[i]-1;
            if(arr[i]>=1 && arr[i]<=arr.length && arr[i]!=arr[ci]){
                int temp=arr[ci];
                arr[ci]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        ArrayList <Integer> ar=new ArrayList<Integer>();
        for(i=0;i<arr.length;i++){
            if(arr[i]-1!=i){
                ar.add(arr[i]);
            }
        }
        return ar;
    }
}