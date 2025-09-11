//2634. Filter Elements from Array



/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    var solarr=[];
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i],i)){
            solarr.push(arr[i]);
        }
    }
    return solarr;
};
