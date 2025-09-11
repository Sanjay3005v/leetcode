//2428. Maximum Sum of an Hourglass


class Solution {
    public int maxSum(int[][] grid) {
        int row=grid.length-2;
        int col=grid[0].length-2;
        int sol=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sol=Math.max(grid[i][j]+grid[i][j+1]+grid[i][j+2]+
                                    grid[i+1][j+1]+
                            grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2],sol);
            }
        }
        return sol;
    }
}
