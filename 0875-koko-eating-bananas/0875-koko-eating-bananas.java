class Solution {
    boolean check(int []arr,int high,int x){
        int c=0;
        for(int i=0;i<arr.length;i++){
            c+=Math.ceil(arr[i]*1.0/high);
        }
        return c<=x;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>high) high=piles[i];
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(piles,mid,h)){
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