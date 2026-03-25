class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(arr[i][j]==target) return true;
        //     }
        // }

        int left=0;
        int right=arr[0].length-1;
        
        while(left<arr.length && right>=0){
            if(arr[left][right]==target) return true;

            if(arr[left][right]<target) left++;
            else right--;
        }
        return false;
    }
}