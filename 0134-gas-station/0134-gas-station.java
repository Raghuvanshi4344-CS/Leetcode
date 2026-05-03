class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int a=0;
        int t=0;
        int c=0;
        for(int i=0;i<cost.length;i++){
            int dif=gas[i]-cost[i];
            t+=dif;
            c+=dif;
            if(c<0){
                a+=1;
                c=0;
            }
        }
        return t>=0?a:-1;
    }
}