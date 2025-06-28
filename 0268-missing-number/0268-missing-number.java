class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        for(;i<arr.length;){
            if(arr[i]<arr.length && arr[i]!=i ){
                int temp=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=temp;
                i=i;
            }
            else {
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
}