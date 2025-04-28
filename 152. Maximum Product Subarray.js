//152. Maximum Product Subarray



/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
    let prod=1;
    let max =Number.MIN_SAFE_INTEGER;

    for(let i=0;i<nums.length;i++){
        prod*=nums[i];
        max=Math.max(max,prod);

        if(prod==0){
            prod=1;
        }
    }
    prod=1;
    for(let i=nums.length-1;i>=0;i--){
        prod*=nums[i];
        max=Math.max(max,prod);

        if(prod==0){
            prod=1;
        }
    }
    return max;
};
