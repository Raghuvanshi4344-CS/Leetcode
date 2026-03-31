class Solution {
    public int arrangeCoins(int n) {
        int x=0;
        while(n>x){
            x++;
            n-=x;
        }
        return x;
    }
}