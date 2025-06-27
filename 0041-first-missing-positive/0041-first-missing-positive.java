class Solution {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length){
            int ci=arr[i]-1;
            if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[ci]){
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
                return i+1;
            }
        }
        return arr.length+1;
    }
}