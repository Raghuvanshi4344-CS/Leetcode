class Solution {
    boolean check(int arr[],int mid,int x){
        int c=0;
        for(int i=0;i<arr.length;i++){
            c+=Math.ceil(arr[i]*1.0/mid);
        }
        return c<=x;
    }
    public int minEatingSpeed(int[] arr, int x) {
        int low=1;
        int high=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>high){
                high=arr[i];
            }
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(arr,mid,x)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}