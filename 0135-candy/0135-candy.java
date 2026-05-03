class Solution {
    public int candy(int[] arr) {
        int min[]=new int[arr.length];
        Arrays.fill(min,1);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                min[i]=min[i-1]+1;
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                min[i]=Math.max(min[i],min[i+1]+1);
            }
        }
        int s=0;
        for(int a:min){
            s+=a;
        }
        return s;
    }
}