//3000. Maximum Area of Longest Diagonal Rectangle


/**
 * @param {number[][]} dimensions
 * @return {number}
 */
var areaOfMaxDiagonal = function(dimensions) {
    let max = 0;
    let sol = 0;
    for(let i=0;i<dimensions.length;i++){
    let diag = Math.sqrt((dimensions[i][0]*dimensions[i][0])+(dimensions[i][1]*dimensions[i][1]));
        if(diag>max){
            max=diag;
            sol=dimensions[i][0]*dimensions[i][1];
        }
        else if(diag==max){
            sol=Math.max(sol,dimensions[i][0]*dimensions[i][1]);
        }
    }
    return sol;
};
