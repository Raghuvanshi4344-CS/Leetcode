class Solution {
    public void sortColors(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(mid<=high){
            if(arr[mid]==0 && arr[low]==0){
                mid++;
                low++;
            }
            else if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
            }
            else if(arr[mid]==2){
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
            else{
                mid++;
            }
        }
    }
}