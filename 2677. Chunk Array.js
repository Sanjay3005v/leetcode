//2677. Chunk Array


/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let sol= [];
    for(let i=0;i<arr.length;i+=size){
        sol.push(arr.slice(i,i+size));
    }
    return sol;
};
