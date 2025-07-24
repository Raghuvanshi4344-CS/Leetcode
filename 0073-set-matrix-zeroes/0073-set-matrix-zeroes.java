class Solution {
    public void setZeroes(int[][] matrix) {
        List<Pair<Integer, Integer>> in = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0 ){
                    in.add(new Pair<>(i,j));
                }
            }
        }
        for(int p=0;p<in.size();p++){
            int row=in.get(p).getKey();
            int col=in.get(p).getValue();
            for(int i=0;i<matrix.length;i++){
                matrix[i][col]=0;
            }
            for(int i=0;i<matrix[0].length;i++){
                matrix[row][i]=0;
            }
        }
    }
}