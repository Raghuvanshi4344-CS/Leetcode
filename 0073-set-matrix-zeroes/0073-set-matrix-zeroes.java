import java.util.*;
class Solution {
    public void helper(int [][]arr,int i,int j){
        for(int k=0;k<arr[0].length;k++){
            arr[i][k]=0;
        }
        for(int k=0;k<arr.length;k++){
            arr[k][j]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int arr[][]=new int [matrix.length][matrix[0].length];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], -1);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) helper(arr,i,j);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(arr[i][j]==0) matrix[i][j]=0;
            }
        }
    }
}