class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        int max=0;
        for(int i=0;i<arr.length;i++){
            int x=arr.length-i;
            int y=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]>=x){
                    y++;
                }
            }
            if(y>=x){
                max=Math.max(max,x);
            }
        }
        return max;
    }
}