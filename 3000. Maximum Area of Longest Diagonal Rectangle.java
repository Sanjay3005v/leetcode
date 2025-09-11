//3000. Maximum Area of Longest Diagonal Rectangle


class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int sol = 0;
        for(int i=0;i<dimensions.length;i++){
            double diag = Math.sqrt((dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]));
            if(diag>max){
                max=diag;
                sol=dimensions[i][0]*dimensions[i][1];
            }
            else if(diag==max){
                sol=Math.max(sol,dimensions[i][0]*dimensions[i][1]);
            }
        }
        return sol;
    }
}
