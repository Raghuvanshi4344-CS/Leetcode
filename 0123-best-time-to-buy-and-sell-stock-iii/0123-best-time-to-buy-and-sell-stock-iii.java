class Solution {
    public int maxProfit(int[] prices) {
        int b1=Integer.MIN_VALUE;
        int b2=Integer.MIN_VALUE;
        int s1=0;
        int s2=0;
        for(int i=0;i<prices.length;i++){
            int x=prices[i];
            b1=Math.max(b1,-x);
            s1=Math.max(b1+x,s1);
            b2=Math.max(b2,s1-x);
            s2=Math.max(s2,b2+x);
        }
        return s2;
    }
}