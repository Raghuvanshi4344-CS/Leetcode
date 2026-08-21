class Solution {
    boolean check(int []arr,int high,int x){
        int s=0;
        int c=1;
        for(int i=0;i<arr.length;i++){
            if(s+arr[i]>high){
                s=0;
                c++;
            }
            s+=arr[i];
        }
        return c<=x;
    }
    public int shipWithinDays(int[] arr, int x) {
        int low=arr[0],high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(arr[i],low);
            high+=arr[i];
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(check(arr,mid,x)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}