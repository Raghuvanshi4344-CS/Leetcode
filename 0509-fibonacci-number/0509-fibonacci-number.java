class Solution {
    public int fib(int n) {
        int arr[]=new int [n+1];
        if(n<2) return n;
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n+1;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}