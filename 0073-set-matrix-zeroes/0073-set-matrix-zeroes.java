class Solution {
    public void setZeroes(int[][] matrix) {
        List<Pair<Integer,Integer>> re=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) re.add(new Pair<>(i,j));
            }
        }
        for(int p=0;p<re.size();p++){
            int row=re.get(p).getKey();
            int col=re.get(p).getValue();
            for(int i=0;i<matrix.length;i++){
                matrix[i][col]=0;
            }
            for(int j=0;j<matrix[0].length;j++){
                matrix[row][j]=0;
            }
        }
    }
}