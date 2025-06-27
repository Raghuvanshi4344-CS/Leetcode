class Solution {
    public int[] sortArray(int[] arr) {
        // for(int i=0;i<arr.length;i++){
        //     int min=i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<arr[min]){min=j;}
        //     }
        //     int temp=arr[i];
        //     arr[i]=arr[min];
        //     arr[min]=temp;
        // }
        
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i]<arr[j]){
        //         int temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;}
        //     }
        // }


        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>k;j--){
                    arr[j+1]=arr[j];
            }
            arr[j+1]=k;
        }
        return arr;
    }
}