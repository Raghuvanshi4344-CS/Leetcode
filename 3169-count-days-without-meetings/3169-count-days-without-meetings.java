class Solution {
    public int countDays(int days, int[][] arr) {
        if(arr.length==0) return 0;
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int c=0;
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]<=end){
                end=Math.max(end,arr[i][1]);
            }
            else{
                c+=(end-start+1);
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        c+=(end-start+1);
        return days-c;
    }
}