class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length()+1;
        int m=word2.length()+1;
        int arr[][]=new int[n][m];
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        int re=m-1+n-1-(2*arr[n-1][m-1]);
        return re;
    }
}