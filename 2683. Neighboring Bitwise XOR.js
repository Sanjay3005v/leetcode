//2683. Neighboring Bitwise XOR


/**
 * @param {number[]} derived
 * @return {boolean}
 */
var doesValidArrayExist = function(derived) {
    let count =0;
    for(let i of derived){
        count^=i;
    }
    return count==0;
};
