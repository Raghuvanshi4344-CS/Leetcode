class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int s=0;
        while(a>0){
            int d=a%10;
            s=d+s*10;
            a/=10;
        }
        return x==s;
    }
}