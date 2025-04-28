//198. House Robber


/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    let max=0,sum=0;
    for(let num of nums){
        let temp=Math.max(max,sum+num);
        sum=max;
        max=temp;
    }
    return max;
};
