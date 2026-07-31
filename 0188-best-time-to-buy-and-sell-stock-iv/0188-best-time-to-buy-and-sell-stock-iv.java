class Solution {
    public int maxProfit(int k, int[] arr) {
        int s[]=new int[k+1];
        int b[]=new int[k+1];
        for(int i=1;i<=k;i++){
            b[i]=Integer.MIN_VALUE;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=k;j++){
                b[j]=Math.max(b[j],s[j-1]-arr[i]);
                s[j]=Math.max(s[j],b[j]+arr[i]);
            }
        }
        return s[k];
    }
}