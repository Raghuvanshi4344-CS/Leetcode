class Solution {
    // int fac(int n){
    //     if(n==0 || n==1) return 1;
    //     return n*fac(n-1);
    // }
    public int trailingZeroes(int n) {
        // int x=fac(n);
        int y=0;
        while(n>0){
            n/=5;
            y+=n;
        }
        return y;
    }
}