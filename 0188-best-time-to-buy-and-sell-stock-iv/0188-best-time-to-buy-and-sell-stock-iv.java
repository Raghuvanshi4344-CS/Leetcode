class Solution {
    public int maxProfit(int k, int[] arr) {
        int n=arr.length;
        // if(k>=n/2){

        // }
        int []buy=new int[k+1];
        int []sell=new int[k+1];

        for(int i=1;i<=k;i++){
            buy[i]=Integer.MIN_VALUE;
            sell[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=k;j++){
                buy[j]=Math.max(buy[j],sell[j-1]-arr[i]);
                sell[j]=Math.max(sell[j],buy[j]+arr[i]);
            }
        }
        return sell[k];
    }
}