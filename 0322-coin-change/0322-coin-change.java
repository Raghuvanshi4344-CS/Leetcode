class Solution {
    public int coinChange(int[] coins, int amount) {
       int n=coins.length;
       int m=amount;
       int arr[][]=new int [n+1][m+1];
       for (int j = 1; j <= amount; j++) {
            arr[0][j] = Integer.MAX_VALUE - 1; 
        }
       for(int i=1;i<=n;i++){
        for(int j=0;j<=m;j++){
            if(coins[i-1]>j){
                arr[i][j]=arr[i-1][j];
            }
            else{
                arr[i][j]=Math.min(arr[i-1][j],arr[i][j-coins[i-1]]+1);
            }
        }
       }
       if(arr[n][m]==Integer.MAX_VALUE - 1) return -1;
       return arr[n][m]; 
    }
}