class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!helper1(board,i,j,n)) return false;
                if(!helper2(board,i,j,n)) return false;
                if(!helper3(board,i,j,n)) return false;
            }
        }
        return true;
    }

    boolean helper1(char arr[][],int i,int j,int n){
        char check=arr[i][j];
        if(check == '.') return true;
        i++;
        for(;i<n;i++){
            if(arr[i][j]==check) return false;
        }
        return true;
    }
    boolean helper2(char arr[][],int i,int j,int n){
        char check=arr[i][j];
        if(check == '.') return true;
        j++;
        for(;j<n;j++){
            if(arr[i][j]==check) return false;
        }
        return true;
    }
    boolean helper3(char arr[][],int i,int j,int n){
        char check=arr[i][j];
        if(check == '.') return true;
        int rowStart = (i / 3) * 3;
        int colStart = (j / 3) * 3;

        for(int r = rowStart; r < rowStart + 3; r++){
            for(int c = colStart; c < colStart + 3; c++){
                if(r == i && c == j) continue;
                if(arr[r][c] == check) return false;
            }
        }
        return true;
    }
}