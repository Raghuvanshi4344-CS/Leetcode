class Solution {
    public int maxProfit(int[] arr) {
        int max=0;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            else if(arr[i]-min>max){
                max=arr[i]-min;
            }
        }
        return max;
    }
}