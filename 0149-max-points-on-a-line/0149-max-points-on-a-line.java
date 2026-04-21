class Solution {
    public int maxPoints(int[][] points) {
        if(points.length<=2) return points.length;
        int max=0;
        for(int i=0;i<points.length;i++){
            Map<String, Integer> map = new HashMap<>();
            int currmax=0;
            int count=0;
            for(int j=i+1;j<points.length;j++){
                int dx=points[j][0]-points[i][0];
                int dy=points[j][1]-points[i][1];

                if(dx==0 && dy==0){ 
                    count++;
                    continue;
                }
                int gcd=gcd(dx,dy);
                dx/=gcd;
                dy/=gcd;
                String slope=dx+"/"+dy;
                map.put(slope,map.getOrDefault(slope,0)+1);

                currmax=Math.max(currmax,map.get(slope));
            }
            max=Math.max(currmax+count+1,max);
        }
        return max;
    }
    private int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}