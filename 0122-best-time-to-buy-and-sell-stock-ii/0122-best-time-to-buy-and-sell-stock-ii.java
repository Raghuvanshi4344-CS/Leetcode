class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int min=prices[0];
        for(int i:prices){
            min=Math.min(i,min);
            if(i>min){
                res=res+(i-min);
                min=i;
            }
        }
        return res;
    }
}