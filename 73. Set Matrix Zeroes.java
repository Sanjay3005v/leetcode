//73. Set Matrix Zeroes


class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row=new ArrayList<Integer>();
        List<Integer> col=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                     row.add(i);
                     col.add(j);
                }
            }
        }
        for(int k=0;k<row.size();k++){
            for(int i=0;i<matrix.length;i++){
                matrix[i][col.get(k)]=0;
            }
        }
        for(int k=0;k<col.size();k++){
            for(int i=0;i<matrix[0].length;i++){
                matrix[row.get(k)][i]=0;
            }
        }
    }
}
