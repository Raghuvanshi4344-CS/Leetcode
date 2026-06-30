class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int a=0,t=0,c=0;
        for(int i=0;i<cost.length;i++){
            int diff=gas[i]-cost[i];
            t+=diff;
            c+=diff;
            if(c<0){
                a=i+1;
                c=0;
            }
        }
        return t>=0 ? a:-1;
    }
}