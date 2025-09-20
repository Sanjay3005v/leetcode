//3467. Transform Array by Parity


/**
 * @param {number[]} nums
 * @return {number[]}
 */
var transformArray = function(nums) {
    let even=0;
    for(let i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            even++;
        }
    }
    for(let i=0;i<even;i++){
        nums[i]=0;
    }
    for(let i=even;i<nums.length;i++){
        nums[i]=1;
    }
    return nums;
};
