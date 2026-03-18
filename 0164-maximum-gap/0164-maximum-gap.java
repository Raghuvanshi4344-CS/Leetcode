class Solution {
    public int maximumGap(int[] arr) {
        // if(arr.length<2) return 0;
        // for(int i=0;i<arr.length;i++){
        //     int min=i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<arr[min]){
        //             min=j;
        //         }
        //     }
        //     int temp=arr[min];
        //     arr[min]=arr[i];
        //     arr[i]=temp;
        // }
        Arrays.sort(arr);
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]>max){
                max=arr[i+1]-arr[i];
            }
        }
        return max;
    }
}