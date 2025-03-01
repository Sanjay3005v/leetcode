//48. Rotate Image


import java.util.*;
class Solution {
    public void rotate(int[][] matrix) {
        int[][] a= new int[matrix.length][matrix.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=matrix[j][i];
            }
        }
        System.out.println(Arrays.deepToString(a));
         for(int i=0;i<a.length;i++){
            int k=a.length-1;
            for(int j=0;j<a.length;j++){
                matrix[i][j]=a[i][k];
                k--;
            }
         }
    }
}
