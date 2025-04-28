//2460. Apply Operations to an Array


/**
 * @param {number[]} nums
 * @return {number[]}
 */
var applyOperations = function(nums) {
    for(let i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            nums[i]*=2;
            nums[i+1]=0;
        }
    }
    let arr = new Array(nums.length).fill(0);
    let j=0;
    for(let i=0;i<nums.length;i++){
        if(nums[i]!==0){
            arr[j]=nums[i];
            j++;
        }
    }
    return arr;
};
