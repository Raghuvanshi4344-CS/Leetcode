class Solution {
    public int[][] merge(int[][] arr) {
        // if (arr.length == 0) return new int[0][0];
        // Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        // List<int[]> re = new ArrayList<>();
        // int[] current = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i][0] <= current[1]) {
        //         current[1] = Math.max(current[1], arr[i][1]);
        //     } else {
        //         re.add(current);
        //         current = arr[i];
        //     }
        // }
        // re.add(current);
        // return re.toArray(new int[re.size()][]);
        if (arr.length==0) return new int[0][0];
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int []>re=new ArrayList<>();
        int[]curr=arr[0];
        for(int i=1;i<arr.length;i++){
            if(curr[1]>=arr[i][0]){
                curr[1]=Math.max(curr[1],arr[i][1]);
            }
            else{
                re.add(curr);
                curr=arr[i];
            }
        }
        re.add(curr);
        return re.toArray(new int[re.size()][]);
    }
}