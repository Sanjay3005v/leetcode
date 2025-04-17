//70. Climbing Stairs


/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    let first=1;
    let second=1;
    for(let i=0;i<n-1;i++){
        let temp = first+second;
        first=second;
        second=temp;
    }
    return second;
};
