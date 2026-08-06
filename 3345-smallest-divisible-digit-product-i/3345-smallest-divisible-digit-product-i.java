class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int pr=1;
            int x=n;
            while(x>0){
                pr*=x%10;
                x/=10;
            }
            if(pr%t==0) return n;
            else n++;
        }
    }
}