//1. Two Sum


/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let sol = new Array();
    for(let i=0;i<nums.length;i++){
        for(let j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                sol.push(i);
                sol.push(j);
                return sol;
            }
        }
    }
    return sol;
};
