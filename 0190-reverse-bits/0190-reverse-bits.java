import java.math.BigInteger;
class Solution {
    public int reverseBits(int n) {
        int a=0;
        for(int i=0;i<32;i++){
            a=a*2 + n%2;
            n=n/2;
        }
        return a;
    }
}