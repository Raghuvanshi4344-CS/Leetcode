class Solution {
    // public boolean check(int arr[],int mid,int h){
    //     int c=0;
    //     for(int i=0;i<arr.length;i++){
    //         c+=Math.ceil((arr[i]*1.0)/mid);
    //     }
    //     return c<=h;
    // }
    public boolean check(int arr[],int mid,int x){
        int c=0;
        for(int i=0;i<arr.length;i++){
            c+=Math.ceil(arr[i]*1.0/mid);
        }
        return c<=x;
    }
    public int minEatingSpeed(int[] arr, int h) {
        // int low=1;
        // int high=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>high){
        //         high=arr[i];
        //     }
        // }
        // int temp=-1;
        // while(low<=high){
        //     int mid=low+(high-low)/2;
        //     if(check(arr,mid,h)){
        //         temp=mid;
        //         high=mid-1;
        //     }
        //     else{
        //         low=mid+1;
        //     }
        // }
        // return temp;
        int low=1;
        int high=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>high){
                high=arr[i];
            }
        }
        int temp=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(arr,mid,h)){
                temp=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return temp;
    }
}