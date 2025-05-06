//191. Number of 1 Bits


/**
 * @param {number} n
 * @return {number}
 */
var hammingWeight = function(n) {
    let count=0;
    while(n!=0){
        count+=n%2;
        n=Math.floor(n/2);
    }
    return count;
};
