//2348. Number of Zero-Filled Subarrays


/**
 * @param {number[]} nums
 * @return {number}
 */
var zeroFilledSubarray = function(nums) {
    let sol = 0;
    let sub = 0;
    for(let num of nums){
        if(num==0){
            sub+=1;
        }
        else{
            sub=0;
        }
        sol+=sub;
    }
    return sol;
};
