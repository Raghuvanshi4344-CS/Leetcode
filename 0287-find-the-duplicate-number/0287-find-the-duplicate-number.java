class Solution {
    public int findDuplicate(int[] arr) {
        int i=0;
        for(;i<arr.length;){
            int ci=arr[i]-1;
            if(arr[i]>=1 && arr[i]<=arr.length && arr[i]!=arr[ci]){
                int temp=arr[i];
                arr[i]=arr[ci];
                arr[ci]=temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return arr[i];
            }
        }
        return arr.length;
    }
}